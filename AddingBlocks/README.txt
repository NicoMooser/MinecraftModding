How to add basic blocks

Step 1 (Create blocks class)
  Under src/main/java -> com.yourname.modid -> init, create class BlockInit (See ./BlockInit.java)
  
Step 2 (Create Block State)
  Under src/main/resources -> assets.modid -> blockstates
  Create blockName.json (See ./BlockStateExample.json)*
  
Step 3 (Create Models)
  Under src/main/resources -> assets.modid -> models
  In block:
    Create blockName.json (See ./BlockModelExample.json)*
  In item:
    Create blockName.json (See ./ItemModelExample.json)*

*Although these files need to be named the same, their content is *different*

Step 4 (Import Texture)
  Import blockName.png texture to textures -> blocks

Step 5 (Edit lang)
  Add "block.modid.blockName" : "In Game Block Name" (e.g. "block.testmod.example_block" : "Example Block")
