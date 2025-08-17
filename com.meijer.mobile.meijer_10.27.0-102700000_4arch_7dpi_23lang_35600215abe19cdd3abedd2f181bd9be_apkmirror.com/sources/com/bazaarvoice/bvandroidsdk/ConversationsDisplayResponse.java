package com.bazaarvoice.bvandroidsdk;

import java.util.List;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public abstract class ConversationsDisplayResponse<ResultType> extends ConversationsResponse {

    @InterfaceC15617c("Limit")
    private Integer limit;

    @InterfaceC15617c("Locale")
    private String locale;

    @InterfaceC15617c("Offset")
    private Integer offset;

    @InterfaceC15617c("Results")
    private List<ResultType> results;

    @InterfaceC15617c("TotalResults")
    private Integer totalResults;

    public Integer getLimit() {
        return this.limit;
    }

    public String getLocale() {
        return this.locale;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public List<ResultType> getResults() {
        return this.results;
    }

    public Integer getTotalResults() {
        return this.totalResults;
    }
}
