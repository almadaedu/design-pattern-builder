import pokemon.Pokemon;
import pokemon.PokemonBuilder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PokemonBuilderTest {
    @Test
    void mustReturnExceptionForPokemonWithout_Number() {
        try {
            PokemonBuilder pokemonBuilder = new PokemonBuilder();
            Pokemon pokemon = pokemonBuilder
                    .setNumber(2)
                    .setName("Charmander")
                    .setType("Fire")
                    .setGeneration(1)
                    .setWeakness("Water")
                    .setHability("Flamethrower")
                    .build();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("pokemon.Pokemon's number must not be empty.", e.getMessage());
        }
    }

    @Test
    void mustReturnExceptionForPokemonWithout_Name() {
        try {
            PokemonBuilder pokemonBuilder = new PokemonBuilder();
            Pokemon pokemon = pokemonBuilder
                    .setNumber(2)
                    .setName("Charmander")
                    .setType("Fire")
                    .setGeneration(1)
                    .setWeakness("Water")
                    .setHability("Flamethrower")
                    .build();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("pokemon.Pokemon's name must not be empty.", e.getMessage());
        }
    }

    @Test
    void mustReturnExceptionForPokemonWithout_Type() {
        try {
            PokemonBuilder pokemonBuilder = new PokemonBuilder();
            Pokemon pokemon = pokemonBuilder
                    .setNumber(2)
                    .setName("Charmander")
                    .setType("Fire")
                    .setGeneration(1)
                    .setWeakness("Water")
                    .setHability("Flamethrower")
                    .build();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("pokemon.Pokemon's type must not be empty.", e.getMessage());
        }
    }

    @Test
    void mustReturnExceptionForPokemonWithout_Generation() {
        try {
            PokemonBuilder pokemonBuilder = new PokemonBuilder();
            Pokemon pokemon = pokemonBuilder
                    .setNumber(2)
                    .setName("Charmander")
                    .setType("Fire")
                    .setGeneration(1)
                    .setWeakness("Water")
                    .setHability("Flamethrower")
                    .build();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("pokemon.Pokemon's generation must not be empty.", e.getMessage());
        }
    }

    @Test
    void mustReturnExceptionForPokemonWithout_Weakness() {
        try {
            PokemonBuilder pokemonBuilder = new PokemonBuilder();
            Pokemon pokemon = pokemonBuilder
                    .setNumber(2)
                    .setName("Charmander")
                    .setType("Fire")
                    .setGeneration(1)
                    .setWeakness("Water")
                    .setHability("Flamethrower")
                    .build();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("pokemon.Pokemon's weakness must not be empty.", e.getMessage());
        }
    }

    @Test
    void mustReturnExceptionForPokemonWithout_Hability() {
        try {
            PokemonBuilder pokemonBuilder = new PokemonBuilder();
            Pokemon pokemon = pokemonBuilder
                    .setNumber(2)
                    .setName("Charmander")
                    .setType("Fire")
                    .setGeneration(1)
                    .setWeakness("Water")
                    .setHability("Flamethrower")
                    .build();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("pokemon.Pokemon's hability must not be empty.", e.getMessage());
        }
    }
}