package com.radiusnetworks.flybuy.sdk.manager.builder;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u000eB#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/builder/SiteOptions;", "", "operationalStatus", "", "page", "", "per", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getOperationalStatus", "()Ljava/lang/String;", "getPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPer", "Builder", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SiteOptions {
    private final String operationalStatus;
    private final Integer page;
    private final Integer per;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0015\u0010\f\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/builder/SiteOptions$Builder;", "", "()V", "operationalStatus", "", "page", "", "Ljava/lang/Integer;", "per", "build", "Lcom/radiusnetworks/flybuy/sdk/manager/builder/SiteOptions;", "setOperationalStatus", "setPage", "(Ljava/lang/Integer;)Lcom/radiusnetworks/flybuy/sdk/manager/builder/SiteOptions$Builder;", "setPer", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private String operationalStatus = "live";
        private Integer page;
        private Integer per;

        public final SiteOptions build() {
            return new SiteOptions(this.operationalStatus, this.page, this.per, null);
        }

        public final Builder setOperationalStatus(String operationalStatus) {
            Intrinsics.j(operationalStatus, "operationalStatus");
            this.operationalStatus = operationalStatus;
            return this;
        }

        public final Builder setPage(Integer page) {
            this.page = page;
            return this;
        }

        public final Builder setPer(Integer per) {
            this.per = per;
            return this;
        }
    }

    public /* synthetic */ SiteOptions(String str, Integer num, Integer num2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, num2);
    }

    private SiteOptions(String str, Integer num, Integer num2) {
        this.operationalStatus = str;
        this.page = num;
        this.per = num2;
    }

    public final String getOperationalStatus() {
        return this.operationalStatus;
    }

    public final Integer getPage() {
        return this.page;
    }

    public final Integer getPer() {
        return this.per;
    }
}
