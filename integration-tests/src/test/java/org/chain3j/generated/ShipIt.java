package org.chain3j.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.chain3j.abi.TypeReference;
import org.chain3j.abi.datatypes.Address;
import org.chain3j.abi.datatypes.Function;
import org.chain3j.abi.datatypes.Type;
import org.chain3j.abi.datatypes.Utf8String;
import org.chain3j.abi.datatypes.generated.Bytes32;
import org.chain3j.abi.datatypes.generated.Uint256;
import org.chain3j.abi.datatypes.generated.Uint8;
import org.chain3j.crypto.Credentials;
import org.chain3j.protocol.Chain3j;
import org.chain3j.protocol.core.RemoteCall;
import org.chain3j.tuples.generated.Tuple8;
import org.chain3j.tx.Contract;
import org.chain3j.tx.TransactionManager;

/**
 * <p>Generated with chain3j version 3.5.0.
 */
public class ShipIt extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610262806100206000396000f3006080604052600436106100405763ffffffff7c0100000000000000000000000000000000000000000000000000000000600035041663d51cd4ac8114610045575b600080fd5b34801561005157600080fd5b5061007373ffffffffffffffffffffffffffffffffffffffff6004351661014c565b6040805173ffffffffffffffffffffffffffffffffffffffff808b1682528916602082015290810187905260608101869052608081018560008111156100b557fe5b60ff168152602001848152602001806020018360001916600019168152602001828103825284818151815260200191508051906020019080838360005b8381101561010a5781810151838201526020016100f2565b50505050905090810190601f1680156101375780820380516001836020036101000a031916815260200191505b50995050505050505050505060405180910390f35b6000602081815291815260409081902080546001808301546002808501546003860154600487015460058801546006890180548b516101009982161599909902600019011695909504601f81018c90048c0288018c01909a5289875273ffffffffffffffffffffffffffffffffffffffff9788169a97909516989297919660ff9091169591939192908301828280156102265780601f106101fb57610100808354040283529160200191610226565b820191906000526020600020905b81548152906001019060200180831161020957829003601f168201915b50505050509080600701549050885600a165627a7a723058201992563050593daf7e729a6bc33c69781340202e4a91b80b5b88c71f972c67d20029";

    public static final String FUNC_SHIPMENTS = "shipments";

    protected ShipIt(String contractAddress, Chain3j chain3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, chain3j, credentials, gasPrice, gasLimit);
    }

    protected ShipIt(String contractAddress, Chain3j chain3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, chain3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<Tuple8<String, String, BigInteger, BigInteger, BigInteger, BigInteger, String, byte[]>> shipments(String param0) {
        final Function function = new Function(FUNC_SHIPMENTS, 
                Arrays.<Type>asList(new org.chain3j.abi.datatypes.Address(param0)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint8>() {}, new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Bytes32>() {}));
        return new RemoteCall<Tuple8<String, String, BigInteger, BigInteger, BigInteger, BigInteger, String, byte[]>>(
                new Callable<Tuple8<String, String, BigInteger, BigInteger, BigInteger, BigInteger, String, byte[]>>() {
                    @Override
                    public Tuple8<String, String, BigInteger, BigInteger, BigInteger, BigInteger, String, byte[]> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple8<String, String, BigInteger, BigInteger, BigInteger, BigInteger, String, byte[]>(
                                (String) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue(), 
                                (BigInteger) results.get(4).getValue(), 
                                (BigInteger) results.get(5).getValue(), 
                                (String) results.get(6).getValue(), 
                                (byte[]) results.get(7).getValue());
                    }
                });
    }

    public static RemoteCall<ShipIt> deploy(Chain3j chain3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ShipIt.class, chain3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<ShipIt> deploy(Chain3j chain3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ShipIt.class, chain3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static ShipIt load(String contractAddress, Chain3j chain3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ShipIt(contractAddress, chain3j, credentials, gasPrice, gasLimit);
    }

    public static ShipIt load(String contractAddress, Chain3j chain3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ShipIt(contractAddress, chain3j, transactionManager, gasPrice, gasLimit);
    }
}
