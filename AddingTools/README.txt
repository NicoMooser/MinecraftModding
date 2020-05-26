Tutorial to add tools i.e. Sword, Pickaxe, Shovel, Axe and Hoe

In ItemInit.java
  public static final Item example_Axe = null;
  
  event.getRegistry().register(new SwordItem(TIER, DAMAGE, ATTACKSPEED, BUILDER))
  e.g. event.getRegistry().register(new SwordItem(ModItemTier.EXAMPLE, 7, 15.0f, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("example_sword"))
  
  *Note Hoe is the only tool that does not have DAMAGE
  
  TIER: ItemTier.
    Diamond
    Gold
    Iron
    Stone
    Wood
  *Custom Tier:
    See ./CustomTier
    For Reference:
      Wood efficiency (2.0), attackDamage (0.0), enchantability(15)
      Diamond efficiency (10.0), attackDamage (10.0)

Edit lang
  "item.modid.toolName": "In Game Name"
  
Create toolName.json
  (See ./example_sword.json)
