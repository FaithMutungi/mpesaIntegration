package com.Precious.Impl.repository;

import com.codelens.documents.B2CC2BEntries;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface B2CC2BEntriesRepository extends MongoRepository<B2CC2BEntries, String> {

    // Find Record By ConversationID or OriginatorConversationID ...
    B2CC2BEntries findByConversationIdOrOriginatorConversationId(String conversationId, String originatorConversationId);

    // Find Transaction By TransactionId ....
    B2CC2BEntries findByTransactionId(String transactionId);

    B2CC2BEntries findByBillRefNumber(String billRefNumber);

}