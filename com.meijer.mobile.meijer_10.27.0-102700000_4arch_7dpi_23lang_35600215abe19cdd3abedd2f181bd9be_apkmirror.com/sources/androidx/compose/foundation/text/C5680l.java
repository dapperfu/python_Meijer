package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import com.google.android.gms.common.api.a;
import e1.C13604d;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/l;", "", "<init>", "()V", "Le1/b;", "event", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Integer;", "Ljava/lang/Integer;", "deadKeyCode", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.text.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5680l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Integer deadKeyCode;

    public final Integer a(KeyEvent event) {
        int iC = C13604d.c(event);
        Integer num = null;
        if ((Integer.MIN_VALUE & iC) != 0) {
            this.deadKeyCode = Integer.valueOf(iC & a.e.API_PRIORITY_OTHER);
            return null;
        }
        Integer num2 = this.deadKeyCode;
        if (num2 != null) {
            this.deadKeyCode = null;
            Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num2.intValue(), iC));
            if (numValueOf.intValue() != 0) {
                num = numValueOf;
            }
            if (num == null) {
                return Integer.valueOf(iC);
            }
            return num;
        }
        return Integer.valueOf(iC);
    }
}
