package r1;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lr1/q;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "b", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "a", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getTestTagsAsResourceId$annotations", "TestTagsAsResourceId", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f157797a = new q();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey<Boolean> TestTagsAsResourceId = new SemanticsPropertyKey<>("TestTagsAsResourceId", false, a.f157800f);

    /* renamed from: c, reason: collision with root package name */
    public static final int f157799c = 8;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<anonymous parameter 1>", "a", "(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function2<Boolean, Boolean, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f157800f = new a();

        a() {
            super(2);
        }

        public final Boolean a(Boolean bool, boolean z10) {
            return bool;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
            return a(bool, bool2.booleanValue());
        }
    }

    public final SemanticsPropertyKey<Boolean> a() {
        return TestTagsAsResourceId;
    }

    private q() {
    }
}
