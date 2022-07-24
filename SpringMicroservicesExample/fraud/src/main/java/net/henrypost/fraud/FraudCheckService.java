package net.henrypost.fraud;

import lombok.AllArgsConstructor;
import net.henrypost.fraud.model.jpa.FraudCheckHistory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

    public static boolean dummyRandFraudDetector() {
        return new Random().nextInt(0, 5) == 3;
    }

    public boolean isFraudster(Integer customerID) {

        FraudCheckHistory h = FraudCheckHistory
                .builder()
                .created(LocalDateTime.now())
                .customerId(customerID)
                .isFraudster(dummyRandFraudDetector())
                .build();

        fraudCheckHistoryRepository.save(h);

        return h.isFraudster();
    }
}
