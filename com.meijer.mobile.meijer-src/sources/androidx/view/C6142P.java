package androidx.view;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "key", "b", "(Ljava/lang/String;)Ljava/lang/String;", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6142P {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(String str) {
        return "StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '" + str + "', but not both.";
    }
}
