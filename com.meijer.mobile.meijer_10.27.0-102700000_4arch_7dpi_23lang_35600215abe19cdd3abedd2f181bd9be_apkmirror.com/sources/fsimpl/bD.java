package fsimpl;

import com.fullstory.instrumentation.frameworks.compose.FSComposeAnchor;
import com.fullstory.instrumentation.frameworks.compose.FSComposeGroupSourceInformation;
import com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode;
import com.fullstory.instrumentation.frameworks.compose.FSComposeSlotWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes14.dex */
public class bD implements bC {

    /* renamed from: a, reason: collision with root package name */
    private final Map f131762a = new WeakHashMap();

    private boolean a(List list, FSComposeGroupSourceInformation fSComposeGroupSourceInformation, int i10) {
        ArrayList arrayList_fsGetGroups = fSComposeGroupSourceInformation._fsGetGroups();
        if (arrayList_fsGetGroups != null && !arrayList_fsGetGroups.isEmpty()) {
            for (Object obj : arrayList_fsGetGroups) {
                if (obj instanceof FSComposeAnchor) {
                    if (((FSComposeAnchor) obj)._fsGetLocation() == i10) {
                        return true;
                    }
                } else if (obj instanceof FSComposeGroupSourceInformation) {
                    FSComposeGroupSourceInformation fSComposeGroupSourceInformation2 = (FSComposeGroupSourceInformation) obj;
                    if (a(list, fSComposeGroupSourceInformation2, i10)) {
                        list.add(Integer.valueOf(fSComposeGroupSourceInformation2._fsGetKey()));
                        return true;
                    }
                } else {
                    C14103fu.c("Encountered unexpected type in FSComposeGroupSourceInformation groups: %s", obj.getClass().getName());
                }
            }
        }
        return false;
    }

    private void b(FSComposeSlotWriter fSComposeSlotWriter, int i10) {
        Object obj_fsGetNode = fSComposeSlotWriter._fsGetNode(i10);
        if (obj_fsGetNode instanceof FSComposeLayoutNode) {
            this.f131762a.put((FSComposeLayoutNode) obj_fsGetNode, c(fSComposeSlotWriter, i10));
        }
        d(fSComposeSlotWriter, i10);
    }

    private List c(FSComposeSlotWriter fSComposeSlotWriter, int i10) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(Integer.valueOf(fSComposeSlotWriter._fsGetGroupKey(i10)));
            int i_fsGetParentGroupIndex = fSComposeSlotWriter._fsGetParentGroupIndex(i10);
            if (i_fsGetParentGroupIndex < 0) {
                break;
            }
            FSComposeGroupSourceInformation fSComposeGroupSourceInformation_fsSourceInformationOf = fSComposeSlotWriter._fsSourceInformationOf(i_fsGetParentGroupIndex);
            if (fSComposeGroupSourceInformation_fsSourceInformationOf != null) {
                a(arrayList, fSComposeGroupSourceInformation_fsSourceInformationOf, i10);
            }
            if (fSComposeSlotWriter._fsGetNode(i_fsGetParentGroupIndex) instanceof FSComposeLayoutNode) {
                break;
            }
            i10 = i_fsGetParentGroupIndex;
        }
        return arrayList;
    }

    private void d(FSComposeSlotWriter fSComposeSlotWriter, int i10) {
        int i_fsGetGroupSize = fSComposeSlotWriter._fsGetGroupSize(i10) + i10;
        int i_fsGetGroupSize2 = i10 + 1;
        while (i_fsGetGroupSize2 < i_fsGetGroupSize) {
            b(fSComposeSlotWriter, i_fsGetGroupSize2);
            i_fsGetGroupSize2 += fSComposeSlotWriter._fsGetGroupSize(i_fsGetGroupSize2);
        }
        C14103fu.b(i_fsGetGroupSize2 == i_fsGetGroupSize, "Ended up past end of group when scanning children", new Object[0]);
    }

    @Override // fsimpl.bC
    public List a(FSComposeLayoutNode fSComposeLayoutNode) {
        return (List) this.f131762a.get(fSComposeLayoutNode);
    }

    public void a(FSComposeSlotWriter fSComposeSlotWriter, int i10) {
        C14103fu.a("ComposeChainCacheImpl.onSlotsInserted", new Object[0]);
        C14103fu.b(i10 > 0, "Size of inserted group must be > 0 but was %d", Integer.valueOf(i10));
        if (fSComposeSlotWriter._fsGetSlotTable() == null) {
            throw new RuntimeException("Could not access SlotTable during insertion.");
        }
        int i_fsGetCurrentGroup = fSComposeSlotWriter._fsGetCurrentGroup();
        if (i_fsGetCurrentGroup == fSComposeSlotWriter._fsGetGroupGapStart()) {
            i_fsGetCurrentGroup -= i10;
        }
        if (C14103fu.f132287a) {
            C14103fu.b(i_fsGetCurrentGroup >= 0, "Invalid groupIndex: %d", Integer.valueOf(i_fsGetCurrentGroup));
            int i_fsGetGroupSize = fSComposeSlotWriter._fsGetGroupSize(i_fsGetCurrentGroup);
            C14103fu.b(i_fsGetGroupSize == i10, "Group size at index %d was %d, which does not match size of group inserted of %d", Integer.valueOf(i_fsGetCurrentGroup), Integer.valueOf(i_fsGetGroupSize), Integer.valueOf(i10));
        }
        b(fSComposeSlotWriter, i_fsGetCurrentGroup);
    }
}
