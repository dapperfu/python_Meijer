package Jv;

import Iv.AbstractC3761b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LJv/x;", "sb", "LIv/b;", "json", "LJv/j;", "a", "(LJv/x;LIv/b;)LJv/j;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: Jv.s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C3935s {
    public static final C3927j a(InterfaceC3940x sb2, AbstractC3761b json) {
        Intrinsics.j(sb2, "sb");
        Intrinsics.j(json, "json");
        return json.getConfiguration().getPrettyPrint() ? new r(sb2, json) : new C3927j(sb2);
    }
}
