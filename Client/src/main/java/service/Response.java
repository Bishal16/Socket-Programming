package service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@ToString
public class Response implements Serializable {
   private double callRate;
}
