package io.constructor.data.builder;

import io.constructor.data.builder.BrowseFacetOptionsRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00102\u00020\u0001:\u0002\u000f\u0010B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lio/constructor/data/builder/BrowseFacetOptionsRequest;", "", "builder", "Lio/constructor/data/builder/BrowseFacetOptionsRequest$Builder;", "(Lio/constructor/data/builder/BrowseFacetOptionsRequest$Builder;)V", "facetName", "", "showHiddenFacets", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getFacetName", "()Ljava/lang/String;", "getShowHiddenFacets", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "Builder", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class BrowseFacetOptionsRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String facetName;
    private final Boolean showHiddenFacets;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lio/constructor/data/builder/BrowseFacetOptionsRequest$Builder;", "", "facetName", "", "(Ljava/lang/String;)V", "getFacetName", "()Ljava/lang/String;", "showHiddenFacets", "", "getShowHiddenFacets", "()Ljava/lang/Boolean;", "setShowHiddenFacets", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "build", "Lio/constructor/data/builder/BrowseFacetOptionsRequest;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder {
        private final String facetName;
        private Boolean showHiddenFacets;

        public final void setShowHiddenFacets(Boolean bool) {
            this.showHiddenFacets = bool;
        }

        public Builder(String facetName) {
            Intrinsics.j(facetName, "facetName");
            this.facetName = facetName;
        }

        public final BrowseFacetOptionsRequest build() {
            return new BrowseFacetOptionsRequest(this, (DefaultConstructorMarker) null);
        }

        public final String getFacetName() {
            return this.facetName;
        }

        public final Boolean getShowHiddenFacets() {
            return this.showHiddenFacets;
        }

        public final Builder setShowHiddenFacets(boolean showHiddenFacets) {
            setShowHiddenFacets(Boolean.valueOf(showHiddenFacets));
            return this;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Lio/constructor/data/builder/BrowseFacetOptionsRequest$Companion;", "", "()V", "build", "Lio/constructor/data/builder/BrowseFacetOptionsRequest;", "facetName", "", "block", "Lkotlin/Function1;", "Lio/constructor/data/builder/BrowseFacetOptionsRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ BrowseFacetOptionsRequest build$default(Companion companion, String facetName, Function1 block, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                block = new Function1<Builder, Unit>() { // from class: io.constructor.data.builder.BrowseFacetOptionsRequest$Companion$build$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(BrowseFacetOptionsRequest.Builder builder) {
                        Intrinsics.j(builder, "$this$null");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(BrowseFacetOptionsRequest.Builder builder) {
                        invoke2(builder);
                        return Unit.f142422a;
                    }
                };
            }
            Intrinsics.j(facetName, "facetName");
            Intrinsics.j(block, "block");
            Builder builder = new Builder(facetName);
            block.invoke(builder);
            return builder.build();
        }

        public final BrowseFacetOptionsRequest build(String facetName, Function1<? super Builder, Unit> block) {
            Intrinsics.j(facetName, "facetName");
            Intrinsics.j(block, "block");
            Builder builder = new Builder(facetName);
            block.invoke(builder);
            return builder.build();
        }
    }

    public /* synthetic */ BrowseFacetOptionsRequest(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public BrowseFacetOptionsRequest(String facetName, Boolean bool) {
        Intrinsics.j(facetName, "facetName");
        this.facetName = facetName;
        this.showHiddenFacets = bool;
    }

    public final String getFacetName() {
        return this.facetName;
    }

    public final Boolean getShowHiddenFacets() {
        return this.showHiddenFacets;
    }

    public /* synthetic */ BrowseFacetOptionsRequest(String str, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : bool);
    }

    private BrowseFacetOptionsRequest(Builder builder) {
        this(builder.getFacetName(), builder.getShowHiddenFacets());
    }
}
