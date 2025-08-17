package com.bazaarvoice.bvandroidsdk;

import java.util.List;

/* loaded from: classes4.dex */
public class ConversationsIncludeProduct extends ConversationsInclude<Product, Review> {
    @Override // com.bazaarvoice.bvandroidsdk.ConversationsInclude
    public /* bridge */ /* synthetic */ List getAnswers() {
        return super.getAnswers();
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsInclude
    public /* bridge */ /* synthetic */ List getAuthors() {
        return super.getAuthors();
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsInclude
    public /* bridge */ /* synthetic */ List getCategory() {
        return super.getCategory();
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsInclude
    public /* bridge */ /* synthetic */ List getComments() {
        return super.getComments();
    }

    public List<Product> getProducts() {
        return super.getItems();
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsInclude
    public /* bridge */ /* synthetic */ List getQuestions() {
        return super.getQuestions();
    }

    public List<Review> getReviews() {
        return getReviewsList();
    }
}
