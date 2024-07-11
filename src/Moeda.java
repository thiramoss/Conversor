import com.google.gson.annotations.SerializedName;

public record Moeda(@SerializedName("conversion_result") String moedaConvertida,
                    @SerializedName("base_code") String moedaBase,
                    @SerializedName("target_code") String moedaFinal) {

    @Override
    public String toString() {
        return "moedaConvertida='" + moedaConvertida + '\'' +
                ", moedaBase='" + moedaBase + '\'' +
                ", moedaFinal='" + moedaFinal + '\'' +
                '}';
    }
}
