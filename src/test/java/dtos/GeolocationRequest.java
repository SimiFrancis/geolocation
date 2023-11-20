package dtos;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GeolocationRequest {
    public int homeMobileCountryCode;
    public int homeMobileNetworkCode;
    public String radioType;
    public String carrier;
    public boolean considerIp;
    public ArrayList<CellTower> cellTowers;
    public ArrayList<WifiAccessPoint> wifiAccessPoints;
}
