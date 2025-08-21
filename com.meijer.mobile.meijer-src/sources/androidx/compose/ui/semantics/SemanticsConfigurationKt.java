package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"getOrNull", "T", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "key", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsConfigurationKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a<T> extends Lambda implements Function0<T> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f52571f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return null;
        }
    }

    public static final <T> T getOrNull(SemanticsConfiguration semanticsConfiguration, SemanticsPropertyKey<T> semanticsPropertyKey) {
        return (T) semanticsConfiguration.p(semanticsPropertyKey, a.f52571f);
    }
}
