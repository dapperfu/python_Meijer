package x4;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "key", "", "a", "(Ljava/lang/String;)Ljava/lang/Void;", "savedstate_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/savedstate/SavedStateReaderKt")
/* renamed from: x4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final /* synthetic */ class C18085e {
    @PublishedApi
    public static final Void a(String key) {
        Intrinsics.j(key, "key");
        throw new IllegalArgumentException("No valid saved state was found for the key '" + key + "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
    }
}
