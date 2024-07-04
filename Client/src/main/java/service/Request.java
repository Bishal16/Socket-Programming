package service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@ToString
public class Request implements Serializable {
    private static final long serialVersionUID = 1L;

    private String callingNumber;
    private String CalledNumber;
    private String callerIp;
    private String callId;

}