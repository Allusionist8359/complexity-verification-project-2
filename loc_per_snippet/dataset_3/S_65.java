    public void s66() {
        mProgramTable.changeSelection(row, 0, false, false);

        Program p = (Program) mProgramTableModel.getValueAt(row, 1);

        JPopupMenu menu = devplugin.Plugin.getPluginManager().createPluginContextMenu(p, CapturePlugin.getInstance());

    } // Added to allow compilation
