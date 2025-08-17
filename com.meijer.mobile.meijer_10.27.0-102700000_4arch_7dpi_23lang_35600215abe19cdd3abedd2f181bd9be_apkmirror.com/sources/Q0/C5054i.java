package Q0;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.geometry.Rect;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\t\u001a\u00020\u0003*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LQ0/d;", "Landroid/view/ViewStructure;", "root", "", "b", "(LQ0/d;Landroid/view/ViewStructure;)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "a", "(LQ0/d;Landroid/util/SparseArray;)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Q0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5054i {
    public static final void b(C5049d c5049d, ViewStructure viewStructure) {
        if (c5049d.getAutofillTree().a().isEmpty()) {
            return;
        }
        int iA = y.f29496a.a(viewStructure, c5049d.getAutofillTree().a().size());
        for (Map.Entry<Integer, I> entry : c5049d.getAutofillTree().a().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            I value = entry.getValue();
            y yVar = y.f29496a;
            ViewStructure viewStructureG = yVar.g(viewStructure, iA);
            yVar.i(viewStructureG, c5049d.getRootAutofillId(), iIntValue);
            yVar.v(viewStructureG, iIntValue, c5049d.getView().getContext().getPackageName(), null, null);
            yVar.j(viewStructureG, M.b(L.INSTANCE.a()));
            List<K> listA = value.a();
            ArrayList arrayList = new ArrayList(listA.size());
            int size = listA.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(C5053h.a(listA.get(i10)));
            }
            yVar.h(viewStructureG, (String[]) arrayList.toArray(new String[0]));
            Rect boundingBox = value.getBoundingBox();
            if (boundingBox == null) {
                FS.log_w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
            } else {
                int iRound = Math.round(boundingBox.getLeft());
                int iRound2 = Math.round(boundingBox.getTop());
                int iRound3 = Math.round(boundingBox.l());
                y.f29496a.r(viewStructureG, iRound, iRound2, 0, 0, iRound3 - iRound, Math.round(boundingBox.i()) - iRound2);
            }
            iA++;
        }
    }

    public static final void a(C5049d c5049d, SparseArray<AutofillValue> sparseArray) {
        if (!c5049d.getAutofillTree().a().isEmpty()) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = sparseArray.keyAt(i10);
                AutofillValue autofillValueA = C5050e.a(sparseArray.get(iKeyAt));
                y yVar = y.f29496a;
                if (yVar.e(autofillValueA)) {
                    c5049d.getAutofillTree().b(iKeyAt, yVar.B(autofillValueA).toString());
                } else if (!yVar.c(autofillValueA)) {
                    if (!yVar.d(autofillValueA)) {
                        if (yVar.f(autofillValueA)) {
                            throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    } else {
                        throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                } else {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
            }
        }
    }
}
