package pokemon;

public class PokemonBuilder {
    private Pokemon pokemon;

    public PokemonBuilder(){
        pokemon = new Pokemon();
    }

    public Pokemon build(){
        if(pokemon.getNumber() == 0){
        throw new IllegalArgumentException("Pokémon Inexistente");
        }
        if(pokemon.getName().isEmpty()){
            throw new IllegalArgumentException("Nome do pokémon inexistente");
        }
        if(pokemon.getType().isEmpty()){
            throw new IllegalArgumentException("pokemon.Pokemon's type must not be empty.");
        }
        if(pokemon.getGeneration() == 0){
            throw new IllegalArgumentException("pokemon.Pokemon's generation must not be empty.");
        }
        if(pokemon.getWeakness().isEmpty()){
            throw new IllegalArgumentException("pokemon.Pokemon's weakness must not be empty.");
        }
        if(pokemon.getHability().isEmpty()){
            throw new IllegalArgumentException("pokemon.Pokemon's hability must not be empty.");
        }
        return pokemon;
    }

    public PokemonBuilder setNumber(int number) {
        pokemon.setNumber(number);
        return this;
    }

    public PokemonBuilder setName(String name) {
        pokemon.setType(name);
        return this;
    }

    public PokemonBuilder setType(String type) {
        pokemon.setType(type);
        return this;
    }

    public PokemonBuilder setGeneration(int generation) {
        pokemon.setGeneration(generation);
        return this;
    }

    public PokemonBuilder setWeakness(String weakness) {
        pokemon.setWeakness(weakness);
        return this;
    }

    public PokemonBuilder setHability(String hability) {
        pokemon.setHability(hability);
        return this;
    }

}