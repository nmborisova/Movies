package bg.smg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieExec {
    private int cert;
    private String name;
    private String address;
    private long networth;
}
