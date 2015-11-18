package org.csstudio.saverestore.data;

import java.io.Serializable;
import java.util.Objects;

import org.csstudio.saverestore.DataProvider;

/**
 *
 * <code>BaseLevel</code> represents the base object that can be selected. These can be for example the top level
 * folders if the data comes from the file system. When the base level is created it is uniquely defined by its
 * storage name. This is also the only property that is required by the {@link DataProvider} to do further loading
 * of data.
 *
 * @author <a href="mailto:jaka.bobnar@cosylab.com">Jaka Bobnar</a>
 *
 */
public abstract class BaseLevel implements Serializable, Comparable<BaseLevel> {
    private static final long serialVersionUID = 7503287144725281421L;

    /**
     * @return the name used for presentation of this base level
     */
    public abstract String getPresentationName();

    /**
     * @return the name used for storage of this base level; has to be unique and can only contain ASCII characters
     */
    public abstract String getStorageName();

    /**
     * Returns the branch on which the base level is located. The {@link DataProvider} is obliged to fill this
     * field (if branches are supported), but the clients of the data provider are not obliged to provide the
     * base level with the proper branch.
     *
     * @return the branch on which this base level is located
     */
    public abstract Branch getBranch();

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BaseLevel other = (BaseLevel) obj;
        return getStorageName().equals(other.getStorageName())
                && ((getBranch() != null && getBranch().equals(other.getBranch()))
                || (getBranch() == null && other.getBranch() == null));
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(BaseLevel.class,getStorageName(),getBranch());
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(BaseLevel o) {
        if (o == null) {
            return -1;
        }
        int i = getStorageName().compareTo(o.getStorageName());
        if (i == 0 && getBranch() != null) {
            return getBranch().compareTo(o.getBranch());
        }
        return i;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return getStorageName();
    }

}
