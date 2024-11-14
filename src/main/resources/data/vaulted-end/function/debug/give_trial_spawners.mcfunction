# These are the trial spawners used in the End City Ship
# This function only exists for debugging purposes, changing these values will NOT affect the game!

# Endermite Trial Spawner
give @s trial_spawner[                                                                                                 \
	block_entity_data={\
		id: "minecraft:trial_spawner",\
		spawn_data: { entity: {id: "endermite"} },\
		normal_config: "vaulted-end:endermite/normal",\
		ominous_config: "vaulted-end:endermite/ominous",\
	}\
] 1


# Shulker Trial Spawner
give @s trial_spawner[                                                                                                 \
	block_entity_data={\
		id: "minecraft:trial_spawner",\
		spawn_data: { entity: {id: "minecraft:shulker", Color: 10b} },\
		normal_config: "vaulted-end:shulker/normal",\
		ominous_config: "vaulted-end:shulker/ominous",\
	}\
] 1
