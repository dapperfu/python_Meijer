package Fv;

import Ev.AbstractC3260b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LEv/b;", "json", "", "source", "LFv/U;", "a", "(LEv/b;Ljava/lang/String;)LFv/U;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class V {
    public static final U a(AbstractC3260b json, String source) {
        Intrinsics.j(json, "json");
        Intrinsics.j(source, "source");
        return !json.getConfiguration().getAllowComments() ? new U(source) : new W(source);
    }
}
