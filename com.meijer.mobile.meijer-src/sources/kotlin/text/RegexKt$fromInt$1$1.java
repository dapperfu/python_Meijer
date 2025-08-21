package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RegexKt$fromInt$1$1 implements Function1<Enum<Object>, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f148369a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(Enum<Object> r32) {
        c cVar = (c) r32;
        return Boolean.valueOf((this.f148369a & cVar.getMask()) == cVar.getValue());
    }
}
