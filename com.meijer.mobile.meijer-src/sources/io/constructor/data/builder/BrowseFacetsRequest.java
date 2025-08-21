package io.constructor.data.builder;

import io.constructor.data.builder.BrowseFacetsRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B5\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lio/constructor/data/builder/BrowseFacetsRequest;", "", "builder", "Lio/constructor/data/builder/BrowseFacetsRequest$Builder;", "(Lio/constructor/data/builder/BrowseFacetsRequest$Builder;)V", "page", "", "offset", "numResultsPerPage", "showHiddenFacets", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getNumResultsPerPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOffset", "getPage", "getShowHiddenFacets", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "Builder", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class BrowseFacetsRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer numResultsPerPage;
    private final Integer offset;
    private final Integer page;
    private final Boolean showHiddenFacets;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\bR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lio/constructor/data/builder/BrowseFacetsRequest$Builder;", "", "()V", "numResultsPerPage", "", "getNumResultsPerPage", "()Ljava/lang/Integer;", "setNumResultsPerPage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "offset", "getOffset", "setOffset", "page", "getPage", "setPage", "showHiddenFacets", "", "getShowHiddenFacets", "()Ljava/lang/Boolean;", "setShowHiddenFacets", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "build", "Lio/constructor/data/builder/BrowseFacetsRequest;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder {
        private Integer numResultsPerPage;
        private Integer offset;
        private Integer page;
        private Boolean showHiddenFacets;

        public final void setNumResultsPerPage(Integer num) {
            this.numResultsPerPage = num;
        }

        public final void setOffset(Integer num) {
            this.offset = num;
        }

        public final void setPage(Integer num) {
            this.page = num;
        }

        public final void setShowHiddenFacets(Boolean bool) {
            this.showHiddenFacets = bool;
        }

        public final BrowseFacetsRequest build() {
            return new BrowseFacetsRequest(this, null);
        }

        public final Integer getNumResultsPerPage() {
            return this.numResultsPerPage;
        }

        public final Integer getOffset() {
            return this.offset;
        }

        public final Integer getPage() {
            return this.page;
        }

        public final Boolean getShowHiddenFacets() {
            return this.showHiddenFacets;
        }

        public final Builder setNumResultsPerPage(int numResultsPerPage) {
            setNumResultsPerPage(Integer.valueOf(numResultsPerPage));
            return this;
        }

        public final Builder setOffset(int offset) {
            setOffset(Integer.valueOf(offset));
            return this;
        }

        public final Builder setPage(int page) {
            setPage(Integer.valueOf(page));
            return this;
        }

        public final Builder setShowHiddenFacets(boolean showHiddenFacets) {
            setShowHiddenFacets(Boolean.valueOf(showHiddenFacets));
            return this;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lio/constructor/data/builder/BrowseFacetsRequest$Companion;", "", "()V", "build", "Lio/constructor/data/builder/BrowseFacetsRequest;", "block", "Lkotlin/Function1;", "Lio/constructor/data/builder/BrowseFacetsRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ BrowseFacetsRequest build$default(Companion companion, Function1 block, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                block = new Function1<Builder, Unit>() { // from class: io.constructor.data.builder.BrowseFacetsRequest$Companion$build$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(BrowseFacetsRequest.Builder builder) {
                        Intrinsics.j(builder, "$this$null");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(BrowseFacetsRequest.Builder builder) {
                        invoke2(builder);
                        return Unit.f143329a;
                    }
                };
            }
            Intrinsics.j(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }

        public final BrowseFacetsRequest build(Function1<? super Builder, Unit> block) {
            Intrinsics.j(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public BrowseFacetsRequest() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ BrowseFacetsRequest(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public final Integer getNumResultsPerPage() {
        return this.numResultsPerPage;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final Integer getPage() {
        return this.page;
    }

    public final Boolean getShowHiddenFacets() {
        return this.showHiddenFacets;
    }

    public BrowseFacetsRequest(Integer num, Integer num2, Integer num3, Boolean bool) {
        this.page = num;
        this.offset = num2;
        this.numResultsPerPage = num3;
        this.showHiddenFacets = bool;
    }

    public /* synthetic */ BrowseFacetsRequest(Integer num, Integer num2, Integer num3, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : num3, (i10 & 8) != 0 ? null : bool);
    }

    private BrowseFacetsRequest(Builder builder) {
        this(builder.getPage(), builder.getOffset(), builder.getNumResultsPerPage(), builder.getShowHiddenFacets());
    }
}
