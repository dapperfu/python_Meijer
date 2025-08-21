package androidx.compose.ui.draw;

import V0.C5490r0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/Modifier;", "LZ0/c;", PlaceTypes.PAINTER, "", "sizeToIntrinsics", "LP0/e;", "alignment", "Landroidx/compose/ui/layout/k;", "contentScale", "", "alpha", "LV0/r0;", "colorFilter", "a", "(Landroidx/compose/ui/Modifier;LZ0/c;ZLP0/e;Landroidx/compose/ui/layout/k;FLV0/r0;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    public static final Modifier a(Modifier modifier, Z0.c cVar, boolean z10, P0.e eVar, InterfaceC5926k interfaceC5926k, float f10, C5490r0 c5490r0) {
        return modifier.then(new PainterElement(cVar, z10, eVar, interfaceC5926k, f10, c5490r0));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, Z0.c cVar, boolean z10, P0.e eVar, InterfaceC5926k interfaceC5926k, float f10, C5490r0 c5490r0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            eVar = P0.e.INSTANCE.e();
        }
        P0.e eVar2 = eVar;
        if ((i10 & 8) != 0) {
            interfaceC5926k = InterfaceC5926k.INSTANCE.f();
        }
        InterfaceC5926k interfaceC5926k2 = interfaceC5926k;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 32) != 0) {
            c5490r0 = null;
        }
        return a(modifier, cVar, z11, eVar2, interfaceC5926k2, f11, c5490r0);
    }
}
