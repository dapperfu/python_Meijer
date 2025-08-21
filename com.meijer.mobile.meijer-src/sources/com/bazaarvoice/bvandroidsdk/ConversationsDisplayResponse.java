package com.bazaarvoice.bvandroidsdk;

import java.util.List;
import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public abstract class ConversationsDisplayResponse<ResultType> extends ConversationsResponse {

    @InterfaceC16127c("Limit")
    private Integer limit;

    @InterfaceC16127c("Locale")
    private String locale;

    @InterfaceC16127c("Offset")
    private Integer offset;

    @InterfaceC16127c("Results")
    private List<ResultType> results;

    @InterfaceC16127c("TotalResults")
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
