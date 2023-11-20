package dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WifiAccessPoint {
    public String macAddress;
    public int signalStrength;
    public int signalToNoiseRatio;
    public int channel;
    public int age;
}
