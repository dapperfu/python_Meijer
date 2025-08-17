package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Regex$special$$inlined$fromInt$1 implements Function1<RegexOption, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f147460a;

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(RegexOption regexOption) {
        RegexOption regexOption2 = regexOption;
        return Boolean.valueOf((this.f147460a & regexOption2.getMask()) == regexOption2.getValue());
    }
}
