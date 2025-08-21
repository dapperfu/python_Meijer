package kotlin.sequences;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes14.dex */
public final class SequencesKt___SequencesKt$filterIsInstance$1 implements Function1<Object, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public static final SequencesKt___SequencesKt$filterIsInstance$1 f148185a = new SequencesKt___SequencesKt$filterIsInstance$1();

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(Object obj) {
        Intrinsics.n(3, "R");
        return Boolean.valueOf(Objects.nonNull(obj));
    }
}
