package androidx.compose.ui.semantics;

import Z.W;
import Z.i0;
import androidx.compose.ui.text.AnnotatedString;
import com.fullstory.instrumentation.frameworks.compose.FSComposeAnnotatedString;
import com.fullstory.instrumentation.frameworks.compose.FSComposeRole;
import com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsConfiguration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import r1.AccessibilityAction;
import r1.u;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u0010\u0010\u000fJ(\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R,\u00101\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010.\u001a\u0004\b/\u00100R*\u00105\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010;\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001c\"\u0004\b9\u0010:R\"\u0010?\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00107\u001a\u0004\b=\u0010\u001c\"\u0004\b>\u0010:¨\u0006@"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Lr1/u;", "", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "<init>", "()V", "T", "key", "n", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;", "Lkotlin/Function0;", "defaultValue", "o", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "p", "", "iterator", "()Ljava/util/Iterator;", "value", "", "a", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Ljava/lang/Object;)V", "", "contains", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z", "h", "()Z", "child", "t", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "peer", "f", "k", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "LZ/W;", "LZ/W;", "q", "()LZ/W;", "props", "", "b", "Ljava/util/Map;", "mapWrapper", "c", "Z", "s", "w", "(Z)V", "isMergingSemanticsOfDescendants", "d", "r", "v", "isClearingSemantics", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SemanticsConfiguration implements u, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, KMappedMarker, FSComposeSemanticsConfiguration {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final W<SemanticsPropertyKey<?>, Object> props = i0.c();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Map<SemanticsPropertyKey<?>, ? extends Object> mapWrapper;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isMergingSemanticsOfDescendants;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isClearingSemantics;

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsConfiguration
    public List _fsGetContentDescription() {
        return (List) SemanticsConfigurationKt.getOrNull(this, SemanticsProperties.INSTANCE.getContentDescription());
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsConfiguration
    public FSComposeAnnotatedString _fsGetEditableText() {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(this, SemanticsProperties.INSTANCE.getEditableText());
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsConfiguration
    public FSComposeRole _fsGetRole() {
        return (FSComposeRole) SemanticsConfigurationKt.getOrNull(this, SemanticsProperties.INSTANCE.getRole());
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsConfiguration
    public Object _fsGetTestTag() {
        return SemanticsConfigurationKt.getOrNull(this, SemanticsProperties.INSTANCE.getTestTag());
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsConfiguration
    public List _fsGetText() {
        return (List) SemanticsConfigurationKt.getOrNull(this, SemanticsProperties.INSTANCE.getText());
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsConfiguration
    public boolean _fsIsDisabled() {
        return contains(SemanticsProperties.INSTANCE.getDisabled());
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsConfiguration
    public boolean _fsIsFocused() {
        Object orNull = SemanticsConfigurationKt.getOrNull(this, SemanticsProperties.INSTANCE.getFocused());
        return orNull != null && ((Boolean) orNull).booleanValue();
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsConfiguration
    public boolean _fsIsPassword() {
        return contains(SemanticsProperties.INSTANCE.getPassword());
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsConfiguration
    public boolean _fsIsTextField() {
        return contains(SemanticsActions.INSTANCE.getSetText());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) other;
        return Intrinsics.e(this.props, semanticsConfiguration.props) && this.isMergingSemanticsOfDescendants == semanticsConfiguration.isMergingSemanticsOfDescendants && this.isClearingSemantics == semanticsConfiguration.isClearingSemantics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r1.u
    public <T> void a(SemanticsPropertyKey<T> key, T value) {
        if (!(value instanceof AccessibilityAction) || !contains(key)) {
            this.props.x(key, value);
            return;
        }
        Object objE = this.props.e(key);
        Intrinsics.h(objE, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        AccessibilityAction accessibilityAction = (AccessibilityAction) objE;
        W<SemanticsPropertyKey<?>, Object> w10 = this.props;
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) value;
        String label = accessibilityAction2.getLabel();
        if (label == null) {
            label = accessibilityAction.getLabel();
        }
        Function functionA = accessibilityAction2.a();
        if (functionA == null) {
            functionA = accessibilityAction.a();
        }
        w10.x(key, new AccessibilityAction(label, functionA));
    }

    public final <T> boolean contains(SemanticsPropertyKey<T> key) {
        return this.props.c(key);
    }

    public final void f(SemanticsConfiguration peer) {
        int i10;
        if (peer.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if (peer.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        W<SemanticsPropertyKey<?>, Object> w10 = peer.props;
        Object[] objArr = w10.keys;
        Object[] objArr2 = w10.values;
        long[] jArr = w10.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j10) < 128) {
                        int i15 = (i11 << 3) + i14;
                        Object obj = objArr[i15];
                        Object obj2 = objArr2[i15];
                        SemanticsPropertyKey<?> semanticsPropertyKey = (SemanticsPropertyKey) obj;
                        if (!this.props.b(semanticsPropertyKey)) {
                            this.props.x(semanticsPropertyKey, obj2);
                        } else if (obj2 instanceof AccessibilityAction) {
                            Object objE = this.props.e(semanticsPropertyKey);
                            Intrinsics.h(objE, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            AccessibilityAction accessibilityAction = (AccessibilityAction) objE;
                            W<SemanticsPropertyKey<?>, Object> w11 = this.props;
                            String label = accessibilityAction.getLabel();
                            if (label == null) {
                                label = ((AccessibilityAction) obj2).getLabel();
                            }
                            i10 = i12;
                            String str = label;
                            Function functionA = accessibilityAction.a();
                            if (functionA == null) {
                                functionA = ((AccessibilityAction) obj2).a();
                            }
                            w11.x(semanticsPropertyKey, new AccessibilityAction(str, functionA));
                        }
                        i10 = i12;
                    } else {
                        i10 = i12;
                    }
                    j10 >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            r15 = this;
            Z.W<androidx.compose.ui.semantics.SemanticsPropertyKey<?>, java.lang.Object> r0 = r15.props
            java.lang.Object[] r1 = r0.keys
            java.lang.Object[] r2 = r0.values
            long[] r0 = r0.metadata
            int r3 = r0.length
            int r3 = r3 + (-2)
            r4 = 0
            if (r3 < 0) goto L50
            r5 = r4
        Lf:
            r6 = r0[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L4b
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L29:
            if (r10 >= r8) goto L49
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L45
            int r11 = r5 << 3
            int r11 = r11 + r10
            r12 = r1[r11]
            r11 = r2[r11]
            androidx.compose.ui.semantics.SemanticsPropertyKey r12 = (androidx.compose.ui.semantics.SemanticsPropertyKey) r12
            boolean r11 = r12.getIsImportantForAccessibility()
            if (r11 == 0) goto L45
            r0 = 1
            return r0
        L45:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L29
        L49:
            if (r8 != r9) goto L50
        L4b:
            if (r5 == r3) goto L50
            int r5 = r5 + 1
            goto Lf
        L50:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsConfiguration.h():boolean");
    }

    public int hashCode() {
        return (((this.props.hashCode() * 31) + Boolean.hashCode(this.isMergingSemanticsOfDescendants)) * 31) + Boolean.hashCode(this.isClearingSemantics);
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> iterator() {
        Map<SemanticsPropertyKey<?>, ? extends Object> mapA = this.mapWrapper;
        if (mapA == null) {
            mapA = this.props.a();
            this.mapWrapper = mapA;
        }
        return mapA.entrySet().iterator();
    }

    public final SemanticsConfiguration k() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        semanticsConfiguration.isClearingSemantics = this.isClearingSemantics;
        semanticsConfiguration.props.s(this.props);
        return semanticsConfiguration;
    }

    public final <T> T n(SemanticsPropertyKey<T> key) {
        T t10 = (T) this.props.e(key);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Key not present: " + key + " - consider getOrElse or getOrNull");
    }

    public final <T> T o(SemanticsPropertyKey<T> key, Function0<? extends T> defaultValue) {
        T t10 = (T) this.props.e(key);
        return t10 == null ? defaultValue.invoke() : t10;
    }

    public final <T> T p(SemanticsPropertyKey<T> key, Function0<? extends T> defaultValue) {
        T t10 = (T) this.props.e(key);
        return t10 == null ? defaultValue.invoke() : t10;
    }

    public final W<SemanticsPropertyKey<?>, Object> q() {
        return this.props;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getIsClearingSemantics() {
        return this.isClearingSemantics;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    public final void t(SemanticsConfiguration child) {
        W<SemanticsPropertyKey<?>, Object> w10 = child.props;
        Object[] objArr = w10.keys;
        Object[] objArr2 = w10.values;
        long[] jArr = w10.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        SemanticsPropertyKey<?> semanticsPropertyKey = (SemanticsPropertyKey) obj;
                        Object objE = this.props.e(semanticsPropertyKey);
                        Intrinsics.h(semanticsPropertyKey, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objC = semanticsPropertyKey.c(objE, obj2);
                        if (objC != null) {
                            this.props.x(semanticsPropertyKey, objC);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[PHI: r4
      0x007b: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v5 java.lang.String) binds: [B:12:0x0042, B:19:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.isMergingSemanticsOfDescendants
            java.lang.String r3 = ", "
            java.lang.String r4 = ""
            if (r2 == 0) goto L18
            r1.append(r4)
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r4 = r3
        L18:
            boolean r2 = r0.isClearingSemantics
            if (r2 == 0) goto L25
            r1.append(r4)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r4 = r3
        L25:
            Z.W<androidx.compose.ui.semantics.SemanticsPropertyKey<?>, java.lang.Object> r2 = r0.props
            java.lang.Object[] r5 = r2.keys
            java.lang.Object[] r6 = r2.values
            long[] r2 = r2.metadata
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L80
            r8 = 0
            r9 = r8
        L34:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L7b
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L4e:
            if (r14 >= r12) goto L79
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L75
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            androidx.compose.ui.semantics.SemanticsPropertyKey r16 = (androidx.compose.ui.semantics.SemanticsPropertyKey) r16
            r1.append(r4)
            java.lang.String r4 = r16.getName()
            r1.append(r4)
            java.lang.String r4 = " : "
            r1.append(r4)
            r1.append(r15)
            r4 = r3
        L75:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4e
        L79:
            if (r12 != r13) goto L80
        L7b:
            if (r9 == r7) goto L80
            int r9 = r9 + 1
            goto L34
        L80:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            java.lang.String r3 = androidx.compose.ui.platform.Q0.a(r0, r3)
            r2.append(r3)
            java.lang.String r3 = "{ "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " }"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsConfiguration.toString():java.lang.String");
    }

    public final void v(boolean z10) {
        this.isClearingSemantics = z10;
    }

    public final void w(boolean z10) {
        this.isMergingSemanticsOfDescendants = z10;
    }
}
