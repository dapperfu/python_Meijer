package Cr;

import ki.StandardButtons;
import ki.StandardLabels;
import ki.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lki/E;", "", "isEnabled", "Lki/q1$d$d;", "a", "(Lki/E;Z)Lki/q1$d$d;", "Lki/G;", "Lki/q1$j;", "b", "(Lki/G;Z)Lki/q1$j;", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {
    public static /* synthetic */ q1.Label c(StandardLabels standardLabels, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return b(standardLabels, z10);
    }

    public static final q1.d.StandardButton a(StandardButtons standardButtons, boolean z10) {
        Intrinsics.j(standardButtons, "<this>");
        return z10 ? standardButtons.getEnabledButton() : standardButtons.getDisabledButton();
    }

    public static final q1.Label b(StandardLabels standardLabels, boolean z10) {
        Intrinsics.j(standardLabels, "<this>");
        return z10 ? standardLabels.getEnabledLabel() : standardLabels.getDisabledLabel();
    }
}
