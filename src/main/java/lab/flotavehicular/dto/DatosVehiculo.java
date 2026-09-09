package lab.flotavehicular.dto;

public record DatosVehiculo(
        String placa,
        String marca,
        int kilometraje,
        TipoVehiculo tipo,
        double nivelEnergia,
        double tonelajeMaximo,
) {
}