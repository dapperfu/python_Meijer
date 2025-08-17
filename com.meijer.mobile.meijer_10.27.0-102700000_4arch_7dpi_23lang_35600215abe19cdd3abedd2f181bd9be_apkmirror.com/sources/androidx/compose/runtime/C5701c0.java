package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "", "it", "a", "(J)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.runtime.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5701c0 extends Lambda implements Function1<Long, Object> {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<Long, Object> f50207f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5701c0(Function1<? super Long, Object> function1) {
        super(1);
        this.f50207f = function1;
    }

    public final Object a(long j10) {
        return this.f50207f.invoke(Long.valueOf(j10 / 1000000));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Long l10) {
        return a(l10.longValue());
    }
}
