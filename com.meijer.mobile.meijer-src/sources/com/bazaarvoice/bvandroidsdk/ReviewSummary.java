package com.bazaarvoice.bvandroidsdk;

import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class ReviewSummary extends IncludeableContent {

    @InterfaceC16127c("detail")
    private String detail;

    @InterfaceC16127c("disclaimer")
    private String disclaimer;

    @InterfaceC16127c("status")
    private Integer status;

    @InterfaceC16127c("summary")
    private String summary;

    @InterfaceC16127c("title")
    private String title;

    @InterfaceC16127c("type")
    private String type;

    public String getDetail() {
        return this.detail;
    }

    public String getDisclaimer() {
        return this.disclaimer;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public void setDetail(String str) {
        this.detail = str;
    }

    public void setDisclaimer(String str) {
        this.disclaimer = str;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludeableContent
    public /* bridge */ /* synthetic */ ConversationsInclude getIncludedIn() {
        return super.getIncludedIn();
    }
}
