Tutorial to add tools i.e. Sword, Pickaxe, Shovel, Axe and Hoe

In ItemInit.java
  public static final Item example_Axe = null;
  
  event.getRegistry().register(new SwordItem(TIER, DAMAGE, ATTACKSPEED, BUILDER)
  
  TIER: ItemTier.
    Diamond
    Gold
    Iron
    Stone
    Wood
  *Custom Tier:
    See ./CustomTier
    Wood efficiency (2.0), attackDamage (0.0), enchantability(15), repair material
    Diamond efficiency (10.0), attackDamage (0.0)
