package io.constructor.data.builder;

import io.constructor.data.builder.BrowseGroupsRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00102\u00020\u0001:\u0002\u000f\u0010B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001d\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lio/constructor/data/builder/BrowseGroupsRequest;", "", "builder", "Lio/constructor/data/builder/BrowseGroupsRequest$Builder;", "(Lio/constructor/data/builder/BrowseGroupsRequest$Builder;)V", "groupId", "", "groupsMaxDepth", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getGroupId", "()Ljava/lang/String;", "getGroupsMaxDepth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Builder", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class BrowseGroupsRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String groupId;
    private final Integer groupsMaxDepth;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lio/constructor/data/builder/BrowseGroupsRequest$Builder;", "", "()V", "groupId", "", "getGroupId", "()Ljava/lang/String;", "setGroupId", "(Ljava/lang/String;)V", "groupsMaxDepth", "", "getGroupsMaxDepth", "()Ljava/lang/Integer;", "setGroupsMaxDepth", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "build", "Lio/constructor/data/builder/BrowseGroupsRequest;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder {
        private String groupId;
        private Integer groupsMaxDepth;

        /* renamed from: setGroupId, reason: collision with other method in class */
        public final void m110setGroupId(String str) {
            this.groupId = str;
        }

        public final void setGroupsMaxDepth(Integer num) {
            this.groupsMaxDepth = num;
        }

        public final BrowseGroupsRequest build() {
            return new BrowseGroupsRequest(this, (DefaultConstructorMarker) null);
        }

        public final String getGroupId() {
            return this.groupId;
        }

        public final Integer getGroupsMaxDepth() {
            return this.groupsMaxDepth;
        }

        public final Builder setGroupId(String groupId) {
            Intrinsics.j(groupId, "groupId");
            m110setGroupId(groupId);
            return this;
        }

        public final Builder setGroupsMaxDepth(int groupsMaxDepth) {
            setGroupsMaxDepth(Integer.valueOf(groupsMaxDepth));
            return this;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lio/constructor/data/builder/BrowseGroupsRequest$Companion;", "", "()V", "build", "Lio/constructor/data/builder/BrowseGroupsRequest;", "block", "Lkotlin/Function1;", "Lio/constructor/data/builder/BrowseGroupsRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ BrowseGroupsRequest build$default(Companion companion, Function1 block, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                block = new Function1<Builder, Unit>() { // from class: io.constructor.data.builder.BrowseGroupsRequest$Companion$build$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(BrowseGroupsRequest.Builder builder) {
                        Intrinsics.j(builder, "$this$null");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(BrowseGroupsRequest.Builder builder) {
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

        public final BrowseGroupsRequest build(Function1<? super Builder, Unit> block) {
            Intrinsics.j(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BrowseGroupsRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ BrowseGroupsRequest(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final Integer getGroupsMaxDepth() {
        return this.groupsMaxDepth;
    }

    public BrowseGroupsRequest(String str, Integer num) {
        this.groupId = str;
        this.groupsMaxDepth = num;
    }

    public /* synthetic */ BrowseGroupsRequest(String str, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num);
    }

    private BrowseGroupsRequest(Builder builder) {
        this(builder.getGroupId(), builder.getGroupsMaxDepth());
    }
}
