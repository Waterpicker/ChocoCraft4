package net.xalcon.chococraft.common.entities.breeding;

import net.minecraft.nbt.NBTTagCompound;

public class ChocoboBreedInfo
{
    private ChocoboStatSnapshot mother;
    private ChocoboStatSnapshot father;

    public ChocoboStatSnapshot getMother()
    {
        return this.mother;
    }

    public ChocoboStatSnapshot getFather()
    {
        return this.father;
    }

    public ChocoboBreedInfo(ChocoboStatSnapshot mother, ChocoboStatSnapshot father)
    {
        this.mother = mother;
        this.father = father;
    }

    public ChocoboBreedInfo(NBTTagCompound nbt)
    {
        this.mother = new ChocoboStatSnapshot(nbt.getCompoundTag("mother"));
        this.father = new ChocoboStatSnapshot(nbt.getCompoundTag("father"));
    }

    public NBTTagCompound serialize()
    {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setTag("mother", this.mother.serialize());
        nbt.setTag("father", this.mother.serialize());
        return nbt;
    }
}