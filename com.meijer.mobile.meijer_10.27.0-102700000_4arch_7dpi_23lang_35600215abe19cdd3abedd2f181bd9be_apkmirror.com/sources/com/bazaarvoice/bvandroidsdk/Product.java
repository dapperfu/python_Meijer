package com.bazaarvoice.bvandroidsdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class Product extends BaseProduct<Object> {

    @InterfaceC15617c("QAStatistics")
    private QAStatistics qaStatistics;
    private transient List<Question> questions;

    @InterfaceC15617c("QuestionIds")
    private List<String> questionsIds;

    public QAStatistics getQaStatistics() {
        return this.qaStatistics;
    }

    public List<Question> getQuestions() {
        if (this.questions == null && this.questionsIds != null && super.getIncludedIn().getQuestions() != null) {
            this.questions = new ArrayList();
            Iterator<String> it = this.questionsIds.iterator();
            while (it.hasNext()) {
                Question question = super.getIncludedIn().getQuestionMap().get(it.next());
                if (question != null) {
                    this.questions.add(question);
                }
            }
        }
        return this.questions;
    }

    public List<Review> getReviews() {
        return getReviewList();
    }
}
