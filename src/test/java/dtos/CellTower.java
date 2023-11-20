package dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CellTower {
        public int cellId;
        public int locationAreaCode;
        public int mobileCountryCode;
        public int mobileNetworkCode;
        public int age;
        public int signalStrength;
        public int timingAdvance;
}
