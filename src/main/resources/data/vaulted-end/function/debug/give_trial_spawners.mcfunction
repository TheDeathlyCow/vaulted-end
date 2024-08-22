# These are the trial spawners used in the End City Ship
# This function only exists for debugging purposes, changing these values will NOT affect the game!

# Endermite Trial Spawner
give @s trial_spawner[                                                                                                 \
	block_entity_data={\
		id: "minecraft:trial_spawner",\
		spawn_data: { entity: {id: "endermite"} },\
		normal_config: {\
			total_mobs: 12,\
			simultaneous_mobs: 4,\
			simultaneous_mobs_added_per_player: 1,\
			ticks_between_spawn: 20,\
			spawn_potentials: [\
				{\
					data: {\
						entity:{id:"minecraft:endermite"}\
					},\
					"weight": 1\
				}                                                                                                      \
			],                                                                                                         \
			loot_tables_to_eject: [                                                                                    \
				{ data: "vaulted-end:trial_spawners/normal/generic_loot", weight: 1 }                                              \
			]\
		},\
		ominous_config: {\
			total_mobs: 18,\
			simultaneous_mobs: 6,\
			simultaneous_mobs_added_per_player: 2,\
			ticks_between_spawn: 20,\
			spawn_potentials: [\
				{\
					data: {\
						entity:{id:"minecraft:endermite"}\
					},\
					weight: 1\
				},\
				{\
					data: {\
							entity: {\
								id:"minecraft:endermite",\
								active_effects: [\
									{id: "minecraft:invisibility", duration: 2400},\
								]\
							}\
					},\
					weight: 1\
				},\
				{\
					data: {\
							entity: {\
								id:"minecraft:endermite",\
								active_effects: [\
									{id: "minecraft:infested", duration: 2400},\
								]\
							}\
					},\
					weight: 1\
				}\
			],\
			loot_tables_to_eject: [\
				{ data: "vaulted-end:trial_spawners/ominous/generic_loot", weight: 1 }\
			]\
		},\
	}\
] 1


# Shulker Trial Spawner
give @s trial_spawner[                                                                                                 \
	block_entity_data={\
		id: "minecraft:trial_spawner",\
		spawn_data: { entity: {id: "minecraft:shulker", Color: 10b} },\
		normal_config: {\
			total_mobs: 6,\
			simultaneous_mobs: 3,\
			simultaneous_mobs_added_per_player: 0.5,\
			ticks_between_spawn: 20,\
			spawn_potentials: [\
				{\
					data: {\
						entity:{ id:"minecraft:shulker", Color: 10b }\
					},\
					"weight": 1\
				}                                                                                                      \
			],                                                                                                         \
			loot_tables_to_eject: [                                                                                    \
				{ data: "vaulted-end:trial_spawners/normal/elytra_key", weight: 1 }                                              \
			]\
		},\
		ominous_config: {\
			total_mobs: 6,\
			simultaneous_mobs: 3,\
			simultaneous_mobs_added_per_player: 1,\
			ticks_between_spawn: 20,\
			spawn_potentials: [\
				{\
					data: {\
						entity:{ id:"minecraft:shulker", Color: 10b }\
					},\
					weight: 1\
				},\
				{\
					data: {\
							entity: {\
								id:"minecraft:shulker",\
								active_effects: [\
									{id: "minecraft:weaving", duration: 2400},\
								],\
								Color: 0b\
							}\
					},\
					weight: 2\
				}\
			],\
			loot_tables_to_eject: [\
				{ data: "vaulted-end:trial_spawners/ominous/elytra_key", weight: 1 }\
			]\
		},\
	}\
] 1
