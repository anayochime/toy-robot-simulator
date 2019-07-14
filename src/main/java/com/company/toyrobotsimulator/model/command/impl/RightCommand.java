package com.company.toyrobotsimulator.model.command.impl;

import com.company.toyrobotsimulator.model.command.CommandAction;
import com.company.toyrobotsimulator.model.command.GridItemCommand;
import com.company.toyrobotsimulator.model.grid.GridItem;
import com.company.toyrobotsimulator.model.grid.MovableGridItem;

public class RightCommand implements GridItemCommand {
    @Override
    public CommandAction getCommandAction() {
        return CommandAction.RIGHT;
    }

    @Override
    public String action(GridItem gridItem) {
        if(gridItem instanceof MovableGridItem){
            MovableGridItem movableGridItem = (MovableGridItem)gridItem;
            movableGridItem.turnRight();
            return null;
        }else{
            throw new RuntimeException("Unsupported GridItem");
        }
    }
}
