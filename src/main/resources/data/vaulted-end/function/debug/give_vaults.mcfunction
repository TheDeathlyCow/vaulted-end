# These are the vaults used in the End City Ship
# This function only exists for debugging purposes, changing these values will NOT affect the game!

# Normal End City Ship vault
give @s minecraft:vault[                                        \
    block_entity_data={                                         \
        id: "minecraft:vault",                                  \
        config: {                                               \
            loot_table: "vaulted-end:vaults/normal/elytra",     \
            key_item: {id: "vaulted-end:elytra_key"}            \
        },                                                      \
    }                                                           \
] 1


# Ominous End City Ship vault
give @s minecraft:vault[                                        \
    block_state={ominous: "true"},                              \
    block_entity_data={                                         \
        id: "minecraft:vault",                                  \
        config: {                                               \
            loot_table: "vaulted-end:vaults/ominous/elytra",    \
            key_item: {id: "vaulted-end:ominous_elytra_key"}    \
        },                                                      \
    }                                                           \
] 1
