/* 
 * Copyright (c) 2006 Stiftung Deutsches Elektronen-Synchroton, 
 * Member of the Helmholtz Association, (DESY), HAMBURG, GERMANY.
 *
 * THIS SOFTWARE IS PROVIDED UNDER THIS LICENSE ON AN "../AS IS" BASIS. 
 * WITHOUT WARRANTY OF ANY KIND, EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED 
 * TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR PARTICULAR PURPOSE AND 
 * NON-INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE 
 * FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, 
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR 
 * THE USE OR OTHER DEALINGS IN THE SOFTWARE. SHOULD THE SOFTWARE PROVE DEFECTIVE 
 * IN ANY RESPECT, THE USER ASSUMES THE COST OF ANY NECESSARY SERVICING, REPAIR OR 
 * CORRECTION. THIS DISCLAIMER OF WARRANTY CONSTITUTES AN ESSENTIAL PART OF THIS LICENSE. 
 * NO USE OF ANY SOFTWARE IS AUTHORIZED HEREUNDER EXCEPT UNDER THIS DISCLAIMER.
 * DESY HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS, 
 * OR MODIFICATIONS.
 * THE FULL LICENSE SPECIFYING FOR THE SOFTWARE THE REDISTRIBUTION, MODIFICATION, 
 * USAGE AND OTHER RIGHTS AND OBLIGATIONS IS INCLUDED WITH THE DISTRIBUTION OF THIS 
 * PROJECT IN THE FILE LICENSE.HTML. IF THE LICENSE IS NOT INCLUDED YOU MAY FIND A COPY 
 * AT HTTP://WWW.DESY.DE/LEGAL/LICENSE.HTM
 */
package org.csstudio.sds.components.model;

import org.csstudio.sds.components.internal.localization.Messages;
import org.csstudio.sds.model.AbstractWidgetModel;
import org.csstudio.sds.model.WidgetPropertyCategory;
import org.csstudio.sds.model.properties.BooleanProperty;
import org.csstudio.sds.model.properties.ColorProperty;
import org.csstudio.sds.model.properties.DoubleProperty;
import org.eclipse.swt.graphics.RGB;

/**
 * This class defines an bargraph widget model.
 * 
 * @author Kai Meyer
 * 
 */
public final class BargraphModel extends AbstractWidgetModel {
	
	/**
	 * The ID of the fill grade property.
	 */
	public static final String PROP_FILL = "fill"; //$NON-NLS-1$
	
	/**
	 * The ID of the orientation property.
	 */
	public static final String PROP_ORIENTATION = "orientation"; //$NON-NLS-1$
	
	/**
	 * The ID of the lolo-Color property.
	 */
	public static final String PROP_LOLO_COLOR = "lolo_color";
	
	/**
	 * The ID of the lo-Color property.
	 */
	public static final String PROP_LO_COLOR = "lo_color";
	
	/**
	 * The ID of the m-Color property.
	 */
	public static final String PROP_M_COLOR = "m_color";
	
	/**
	 * The ID of the hi-Color property.
	 */
	public static final String PROP_HI_COLOR = "hi_color";
	
	/**
	 * The ID of the hihi-Color property.
	 */
	public static final String PROP_HIHI_COLOR = "hihi_color";
	
	/**
	 * The ID of the show_value property.
	 */
	public static final String PROP_SHOW_VALUES = "show_value";
	
	/**
	 * The ID of the minimum property.
	 */
	public static final String PROP_MIN = "minimum";
	/**
	 * The ID of the lolo level property.
	 */
	public static final String PROP_LOLO_LEVEL = "lolo_level";
	/**
	 * The ID of the lo level property.
	 */
	public static final String PROP_LO_LEVEL = "lo_level";
	/**
	 * The ID of the m level property.
	 */
	public static final String PROP_M_LEVEL = "m_level";
	/**
	 * The ID of the hi level property.
	 */
	public static final String PROP_HI_LEVEL = "hi_level";
	/**
	 * The ID of the hihi level property.
	 */
	public static final String PROP_HIHI_LEVEL = "hihi_level";
	/**
	 * The ID of the maximum property.
	 */
	public static final String PROP_MAX = "maximum";

	/**
	 * The ID of this widget model.
	 */
	public static final String ID = "element.bargraph"; //$NON-NLS-1$
		
	/**
	 * The default value of the fill grade property.
	 */
	private static final double DEFAULT_FILL = 25;
	
	/**
	 * The default value of the orientation property.
	 */
	private static final boolean DEFAULT_ORIENTATION_HORIZONTAL = true;

	/**
	 * The default value of the lolo color property. 
	 */
	private static final RGB DEFAULT_LOLO_COLOR = new RGB(255,0,0);
	
	/**
	 * The default value of the lolo color property. 
	 */
	private static final RGB DEFAULT_LO_COLOR = new RGB(255,100,100);
	
	/**
	 * The default value of the lolo color property. 
	 */
	private static final RGB DEFAULT_M_COLOR = new RGB(0,255,255);
	
	/**
	 * The default value of the lolo color property. 
	 */
	private static final RGB DEFAULT_HI_COLOR = new RGB(0,255,255);
	
	/**
	 * The default value of the lolo color property. 
	 */
	private static final RGB DEFAULT_HIHI_COLOR = new RGB(255,255,255);
	
	/**
	 * The default value of the show_value property. 
	 */
	private static final boolean DEFAULT_SHOW_VALUES = false;
	
	/**
	 * The default value of the levels property. 
	 */
	private static final double[] DEFAULT_LEVELS = new double[]{0.0, 0.2, 0.4, 0.6, 0.8, 1.0, 1.0};

//	/**
//	 * The default value of the lolo max property.
//	 */
//	private static final double DEFAULT_LOLO_MAX = 0.1;

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureProperties() {
		addProperty(PROP_FILL, new DoubleProperty(Messages.FillLevelProperty,
				WidgetPropertyCategory.Behaviour, DEFAULT_FILL, 0.0, 100.0));
		addProperty(PROP_ORIENTATION, new BooleanProperty("Horizontal Orientation", WidgetPropertyCategory.Behaviour, DEFAULT_ORIENTATION_HORIZONTAL));
		//Colors
		addProperty(PROP_LOLO_COLOR, new ColorProperty("Color LOLO",WidgetPropertyCategory.Display,DEFAULT_LOLO_COLOR));
		addProperty(PROP_LO_COLOR, new ColorProperty("Color LO",WidgetPropertyCategory.Display,DEFAULT_LO_COLOR));
		addProperty(PROP_M_COLOR, new ColorProperty("Color M",WidgetPropertyCategory.Display,DEFAULT_M_COLOR));
		addProperty(PROP_HI_COLOR, new ColorProperty("Color HI",WidgetPropertyCategory.Display,DEFAULT_HI_COLOR));
		addProperty(PROP_HIHI_COLOR, new ColorProperty("Color HIHI",WidgetPropertyCategory.Display,DEFAULT_HIHI_COLOR));
		//Levels
		addProperty(PROP_MIN, new DoubleProperty("Minimum", WidgetPropertyCategory.Behaviour,DEFAULT_LEVELS[0]));
		addProperty(PROP_LOLO_LEVEL, new DoubleProperty("Level LOLO", WidgetPropertyCategory.Behaviour,DEFAULT_LEVELS[1]));
		addProperty(PROP_LO_LEVEL, new DoubleProperty("Level LO", WidgetPropertyCategory.Behaviour,DEFAULT_LEVELS[2]));
		addProperty(PROP_M_LEVEL, new DoubleProperty("Level M", WidgetPropertyCategory.Behaviour,DEFAULT_LEVELS[3]));
		addProperty(PROP_HI_LEVEL, new DoubleProperty("Level HI", WidgetPropertyCategory.Behaviour,DEFAULT_LEVELS[4]));
		addProperty(PROP_HIHI_LEVEL, new DoubleProperty("Level HIHI", WidgetPropertyCategory.Behaviour,DEFAULT_LEVELS[5]));
		addProperty(PROP_MAX, new DoubleProperty("Maximum", WidgetPropertyCategory.Behaviour,DEFAULT_LEVELS[6]));
		//Show_Value
		addProperty(PROP_SHOW_VALUES, new BooleanProperty("Show values", WidgetPropertyCategory.Display, DEFAULT_SHOW_VALUES));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getTypeID() {
		return ID;
	}
	
	/**
	 * Gets the fill level.
	 * 
	 * @return double
	 * 				The fill level
	 */
	public double getFillLevel() {
		return (Double) getProperty(PROP_FILL).getPropertyValue();
	}
	
	/**
	 * Gets the orientation.
	 * 
	 * @return the orientation
	 */
	public boolean getOrientation() {
		return (Boolean) getProperty(PROP_ORIENTATION).getPropertyValue();
	}
	
	/**
	 * Gets the RGB for lolo fill level.
	 * @return The lolo fill level color
	 */
	public RGB getLoloColor() {
		return (RGB) getProperty(PROP_LOLO_COLOR).getPropertyValue();
	}
	
	/**
	 * Gets the RGB for lo fill level.
	 * @return The lo fill level color
	 */
	public RGB getLoColor() {
		return (RGB) getProperty(PROP_LO_COLOR).getPropertyValue();
	}
	
	/**
	 * Gets the RGB for m fill level.
	 * @return The m fill level color
	 */
	public RGB getMColor() {
		return (RGB) getProperty(PROP_M_COLOR).getPropertyValue();
	}
	
	/**
	 * Gets the RGB for hi fill level.
	 * @return The hi fill level color
	 */
	public RGB getHiColor() {
		return (RGB) getProperty(PROP_HI_COLOR).getPropertyValue();
	}
	
	/**
	 * Gets the RGB for hihi fill level.
	 * @return The hihi fill level color
	 */
	public RGB getHihiColor() {
		return (RGB) getProperty(PROP_HIHI_COLOR).getPropertyValue();
	}
	
	/**
	 * Gets the minimum value for this model.
	 * @return double
	 * 				The minimum value
	 */
	public double getMinimum() {
		return (Double) getProperty(PROP_MIN).getPropertyValue();
	}
	
	/**
	 * Gets the lolo level for this model.
	 * @return double
	 * 				The lolo level
	 */
	public double getLoloLevel() {
		return (Double) getProperty(PROP_LOLO_LEVEL).getPropertyValue();
	}
	
	/**
	 * Gets the lo level for this model.
	 * @return double
	 * 				The lo level
	 */
	public double getLoLevel() {
		return (Double) getProperty(PROP_LO_LEVEL).getPropertyValue();
	}
	
	/**
	 * Gets the m level for this model.
	 * @return double
	 * 				The m level
	 */
	public double getMLevel() {
		return (Double) getProperty(PROP_M_LEVEL).getPropertyValue();
	}
	
	/**
	 * Gets the hi level for this model.
	 * @return double
	 * 				The hi level
	 */
	public double getHiLevel() {
		return (Double) getProperty(PROP_HI_LEVEL).getPropertyValue();
	}
	
	/**
	 * Gets the minimum value for this model.
	 * @return double
	 * 				The minimum value
	 */
	public double getHihiLevel() {
		return (Double) getProperty(PROP_HIHI_LEVEL).getPropertyValue();
	}
	
	/**
	 * Gets the maximum value for this model.
	 * @return double
	 * 				The maximum value
	 */
	public double getMaximum() {
		return (Double) getProperty(PROP_MAX).getPropertyValue();
	}
	
	/**
	 * Gets, if the values showed be shown or not.
	 * @return boolean
	 * 				true, if the values should be shown, false otherwise
	 */
	public boolean getShowValues() {
		return (Boolean) getProperty(PROP_SHOW_VALUES).getPropertyValue();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getDoubleTestProperty() {
		return PROP_FILL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getColorTestProperty() {
		return PROP_COLOR_FOREGROUND;
	}
	
	/**
	 * Return the Id of the widget model lolo color property.
	 * @return String
	 * 				The Id of the widget model lolo color property
	 */
	public String getLoloColorTestProperty() {
		return PROP_LOLO_COLOR;
	}
	
	/**
	 * Return the Id of the widget model lo color property.
	 * @return String
	 * 				The Id of the widget model lo color property
	 */
	public String getLoColorTestProperty() {
		return PROP_LO_COLOR;
	}
	
	/**
	 * Return the Id of the widget model m color property.
	 * @return String
	 * 				The Id of the widget model m color property
	 */
	public String getMColorTestProperty() {
		return PROP_M_COLOR;
	}
	
	/**
	 * Return the Id of the widget model hi color property.
	 * @return String
	 * 				The Id of the widget model hi color property
	 */
	public String getHiColorTestProperty() {
		return PROP_HI_COLOR;
	}
	
	/**
	 * Return the Id of the widget model hihi color property.
	 * @return String
	 * 				The Id of the widget model hihi color property
	 */
	public String getHihiColorTestProperty() {
		return PROP_HIHI_COLOR;
	}

}
