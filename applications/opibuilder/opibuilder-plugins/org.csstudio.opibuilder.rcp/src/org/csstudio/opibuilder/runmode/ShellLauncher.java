/*******************************************************************************
 * Copyright (c) 2014 Oak Ridge National Laboratory.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.csstudio.opibuilder.runmode;

import org.eclipse.core.runtime.IPath;
import org.eclipse.ui.IEditorLauncher;

/** {@link IEditorLauncher} that opens display in new OPIShell.
 *
 *  <p>Registered in plugin.xml as "Editor" for *.opi files,
 *  allowing users to launch displays from the Eclipse Navigator,
 *  or by opening the file in the "default editor" based
 *  on the Eclipse registry.
 *
 *  @author Kay Kasemir
 *  @author Will Rogers
 *  @author Jaka Bobnar
 */
<<<<<<< HEAD
public class ShellLauncher extends AbstractOPISimulationEditor {
=======
public class ShellLauncher implements IEditorLauncher
{
    @Override
    public void open(final IPath path)
    {
        //The path is an absolute system path, which needs to be transformed to workspace path
        IPath workspacePath = LauncherHelper.systemPathToWorkspacePath(path);
        OPIShell.openOPIShell(workspacePath, null);
>>>>>>> branch 'master' of git://io-ls-git-css-trunk/cs-studio

    private static class ShellFocusable implements Focusable {
        private final OPIShell shell;
        ShellFocusable(OPIShell shell) {
            this.shell = shell;
        }
        @Override
        public void focus() {
            shell.raiseToTop();
        }
    }

    @Override
    public Focusable run(IPath path) {
        return new ShellFocusable(OPIShell.openOPIShell(path, null));
    }
}
