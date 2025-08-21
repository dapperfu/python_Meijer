package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BaseProduct;
import com.bazaarvoice.bvandroidsdk.BaseReview;
import io.constructor.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import og.InterfaceC16127c;

/* loaded from: classes4.dex */
class ConversationsInclude<ProductType extends BaseProduct, ReviewType extends BaseReview> {

    @InterfaceC16127c("Answers")
    private Map<String, Answer> answerMap;
    private transient List<Answer> answers;

    @InterfaceC16127c("Authors")
    private Map<String, Author> authorMap;
    private transient List<Author> authors;
    private transient List<Category> category;

    @InterfaceC16127c("Categories")
    private Map<String, Category> categoryMap;

    @InterfaceC16127c("Comments")
    private Map<String, Comment> commentMap;
    private transient List<Comment> comments;

    @InterfaceC16127c(BuildConfig.DEFAULT_ITEM_SECTION)
    private Map<String, ProductType> itemMap;
    private transient List<ProductType> items;

    @InterfaceC16127c("Questions")
    private Map<String, Question> questionMap;
    private transient List<Question> questions;

    @InterfaceC16127c("Reviews")
    private Map<String, ReviewType> reviewMap;
    private transient List<ReviewType> reviews;

    private <ContentType extends IncludeableContent> List<ContentType> processContent(Map<String, ContentType> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (ContentType contenttype : map.values()) {
                contenttype.setIncludedIn(this);
                arrayList.add(contenttype);
            }
        }
        return arrayList;
    }

    protected Map<String, Answer> getAnswerMap() {
        return this.answerMap;
    }

    public List<Answer> getAnswers() {
        if (this.answers == null) {
            this.answers = processContent(this.answerMap);
        }
        return this.answers;
    }

    protected Map<String, Author> getAuthorMap() {
        return this.authorMap;
    }

    public List<Author> getAuthors() {
        if (this.authors == null) {
            this.authors = processContent(this.authorMap);
        }
        return this.authors;
    }

    public List<Category> getCategory() {
        if (this.category == null) {
            this.category = processContent(this.categoryMap);
        }
        return this.category;
    }

    protected Map<String, Category> getCategoryMap() {
        return this.categoryMap;
    }

    protected Map<String, Comment> getCommentMap() {
        return this.commentMap;
    }

    public List<Comment> getComments() {
        if (this.comments == null) {
            this.comments = processContent(this.commentMap);
        }
        return this.comments;
    }

    protected Map<String, ProductType> getItemMap() {
        return this.itemMap;
    }

    protected List<ProductType> getItems() {
        if (this.items == null) {
            this.items = (List<ProductType>) processContent(this.itemMap);
        }
        return this.items;
    }

    protected Map<String, Question> getQuestionMap() {
        return this.questionMap;
    }

    public List<Question> getQuestions() {
        if (this.questions == null) {
            this.questions = processContent(this.questionMap);
        }
        return this.questions;
    }

    protected Map<String, ReviewType> getReviewMap() {
        return this.reviewMap;
    }

    protected List<ReviewType> getReviewsList() {
        if (this.reviews == null) {
            this.reviews = (List<ReviewType>) processContent(this.reviewMap);
        }
        return this.reviews;
    }

    ConversationsInclude() {
    }
}
