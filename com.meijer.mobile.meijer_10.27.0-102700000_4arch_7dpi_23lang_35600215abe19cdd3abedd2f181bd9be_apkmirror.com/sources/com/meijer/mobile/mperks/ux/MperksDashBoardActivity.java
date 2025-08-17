package com.meijer.mobile.mperks.ux;

import Ji.C;
import Ji.LocalThemeScope;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5724i0;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.AbstractC6023l;
import androidx.view.C5994J;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.InterfaceC6027p;
import androidx.view.InterfaceC6030s;
import androidx.view.f0;
import bo.AutoClaimReward;
import bo.ClaimReward;
import bo.ClippedReward;
import bo.EarnReward;
import bo.EnumC6273c;
import bo.g;
import bo.h;
import com.fullstory.FS;
import com.fullstory.FSPage;
import com.meijer.mobile.meijer.activity.home.HomeFragment;
import com.meijer.mobile.mperks.ux.MperksDashBoardActivity;
import com.meijer.mobile.mperks.ux.V;
import com.meijer.mobile.mperks.ux.learnToEarn.LearnToEarnActivity;
import com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryActivity;
import e.C13589e;
import fi.GoogleAdAnalytics;
import fi.GoogleAdData;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import hi.C14476c;
import hi.TrackingData;
import j$.time.ZonedDateTime;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ji.q1;
import ko.AbstractC15200a;
import ko.AbstractC15202c;
import ko.ClaimTabState;
import kotlin.A1;
import kotlin.AbstractC15962C;
import kotlin.C15433D;
import kotlin.C15963D;
import kotlin.C17893M0;
import kotlin.C17921a1;
import kotlin.C17927c1;
import kotlin.C17929d0;
import kotlin.C17932e0;
import kotlin.C17963o1;
import kotlin.EnumC17935f0;
import kotlin.Function;
import kotlin.InterfaceC15985u;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import no.MccEnrollmentState;
import no.PointsExpState;
import oo.EarnAvailableViewState;
import oo.EarnInProgressState;
import oo.e0;
import org.xmlpull.v1.XmlPullParserException;
import p1.C16193g;
import ps.AbstractC16373C;
import ps.C16372B;
import ps.C16381K;
import ps.C16382L;
import ps.C16395g;
import ps.DrawerLayoutDecorator;
import ps.HeaderDecorator;
import qo.AbstractC16581o;
import qo.C16551B;
import qo.C16558I;
import qo.RewardsViewState;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17144F;
import tv.InterfaceC17152f;
import vk.C17590a;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000º\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 Ó\u00012\u00020\u0001:\u0002Ô\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJG\u0010\u0016\u001a\u00020\u000626\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00060\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0018\u0010\u0003JK\u0010'\u001a\u00020\u0006*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\b\u0002\u0010&\u001a\u00020%H\u0003¢\u0006\u0004\b'\u0010(Jé\u0001\u0010A\u001a\u00020\u0006*\u00020\u00192\u0006\u0010)\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020*2\b\b\u0002\u0010&\u001a\u00020%2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u0006072\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0006092\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0006072\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0006072\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0006072\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0006072\u0014\b\u0002\u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000609H\u0003¢\u0006\u0004\bA\u0010BJ¡\u0001\u0010H\u001a\u00020\u0006*\u00020\u00192\u0006\u0010-\u001a\u00020,2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010)\u001a\u00020#2\u0006\u0010C\u001a\u00020*2\u0006\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.2\u0006\u0010D\u001a\u00020#2\u0006\u0010F\u001a\u00020E2\b\b\u0002\u0010&\u001a\u00020%2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u0006092\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0006092\u0006\u00103\u001a\u0002022\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000607H\u0003¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\u00062\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u00062\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJ\u001d\u0010R\u001a\u00020\u00062\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\bR\u0010SJ#\u0010W\u001a\u00020\u0006*\u00020\u00192\u0006\u0010\u0014\u001a\u00020T2\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bW\u0010XJ%\u0010\\\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020#2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\"H\u0002¢\u0006\u0004\b\\\u0010]J/\u0010b\u001a\u00020\u00062\u0006\u0010)\u001a\u00020#2\u0006\u0010^\u001a\u00020Z2\u0006\u0010_\u001a\u00020Z2\u0006\u0010a\u001a\u00020`H\u0002¢\u0006\u0004\bb\u0010cJ%\u0010e\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020#2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020Z0\"H\u0002¢\u0006\u0004\be\u0010]J7\u0010k\u001a\u00020\u00062\u0006\u0010g\u001a\u00020f2\u0006\u0010h\u001a\u00020*2\u0006\u0010i\u001a\u00020Z2\u0006\u0010)\u001a\u00020#2\u0006\u0010j\u001a\u00020*H\u0002¢\u0006\u0004\bk\u0010lJ\u001f\u0010n\u001a\u00020\u00062\u0006\u0010m\u001a\u00020Z2\u0006\u0010)\u001a\u00020ZH\u0002¢\u0006\u0004\bn\u0010oJ\u0017\u0010r\u001a\u00020\u00062\u0006\u0010q\u001a\u00020pH\u0002¢\u0006\u0004\br\u0010sJ\u0017\u0010v\u001a\u00020\u00062\u0006\u0010u\u001a\u00020tH\u0002¢\u0006\u0004\bv\u0010wJ\u0019\u0010x\u001a\u00020\u00062\b\u0010u\u001a\u0004\u0018\u00010tH\u0002¢\u0006\u0004\bx\u0010wJ\u001f\u0010|\u001a\u00020\u00062\u0006\u0010y\u001a\u00020Z2\u0006\u0010{\u001a\u00020zH\u0002¢\u0006\u0004\b|\u0010}J \u0010\u007f\u001a\u00020\u00062\u0006\u0010~\u001a\u00020E2\u0006\u0010Y\u001a\u00020#H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001b\u0010\u0082\u0001\u001a\u00020\u00062\u0007\u0010\u0014\u001a\u00030\u0081\u0001H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J!\u0010\u0084\u0001\u001a\u00020\u00062\u0006\u0010)\u001a\u00020Z2\u0006\u0010{\u001a\u00020zH\u0002¢\u0006\u0005\b\u0084\u0001\u0010}J\"\u0010\u0086\u0001\u001a\u00020\u00062\u0006\u0010)\u001a\u00020Z2\u0007\u0010\u0085\u0001\u001a\u00020ZH\u0002¢\u0006\u0005\b\u0086\u0001\u0010oJ\u001a\u0010\u0087\u0001\u001a\u00020\u00062\u0006\u0010)\u001a\u00020ZH\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001R!\u0010\u008e\u0001\u001a\u00030\u0089\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R!\u0010\u0093\u0001\u001a\u00030\u008f\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u008b\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R!\u0010\u0098\u0001\u001a\u00030\u0094\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u008b\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R!\u0010\u009d\u0001\u001a\u00030\u0099\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u008b\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010V\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0019\u0010¤\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R!\u0010©\u0001\u001a\u00030¥\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¦\u0001\u0010\u008b\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R!\u0010®\u0001\u001a\u00030ª\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0001\u0010\u008b\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001b\u0010±\u0001\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0019\u0010³\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010 \u0001R\u0019\u0010µ\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010£\u0001R\u0019\u0010·\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010£\u0001R\u0019\u0010¹\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010£\u0001R\u0018\u0010D\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010 \u0001R\u0019\u0010¼\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010£\u0001R\u001e\u0010À\u0001\u001a\t\u0012\u0004\u0012\u00020\n0½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\"\u0010Å\u0001\u001a\r Â\u0001*\u0005\u0018\u00010Á\u00010Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u001d\u0010È\u0001\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0017\u0010Ë\u0001\u001a\u00020*8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0017\u0010Í\u0001\u001a\u00020*8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010Ê\u0001R\u0017\u0010Ï\u0001\u001a\u00020*8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ê\u0001R\u0016\u0010+\u001a\u00020*8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ê\u0001R\u0017\u0010Ò\u0001\u001a\u00020*8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ê\u0001¨\u0006Û\u0001²\u0006\f\u0010\u001d\u001a\u00020\u001c8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001f\u001a\u00020\u001e8\nX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002²\u0006\f\u0010/\u001a\u00020.8\nX\u008a\u0084\u0002²\u0006\u000f\u0010Õ\u0001\u001a\u00020?8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010Ö\u0001\u001a\u00020?8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010×\u0001\u001a\u00020?8\n@\nX\u008a\u008e\u0002²\u0006\f\u00103\u001a\u0002028\nX\u008a\u0084\u0002²\u0006\f\u00101\u001a\u0002008\nX\u008a\u0084\u0002²\u0006\u000e\u00105\u001a\u00020*8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010Ø\u0001\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010F\u001a\u00020E8\n@\nX\u008a\u008e\u0002²\u0006\u0011\u0010Ù\u0001\u001a\u0004\u0018\u00010Z8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010Ú\u0001\u001a\u00020*8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/meijer/mobile/mperks/ux/MperksDashBoardActivity;", "Lcom/meijer/mobile/mperks/ux/MperksFeatureActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Lkotlin/Function2;", "Landroidx/lifecycle/s;", "Lkotlin/ParameterName;", "name", "owner", "Landroidx/lifecycle/l$a;", "event", "onEvent", "d2", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "onPause", "LJi/M;", "Lx0/c1;", "scaffoldState", "Lps/F;", "drawerHeader", "Lps/t;", "drawerDecorator", "Lcom/meijer/mobile/mperks/ux/V$c;", "pointsBalanceState", "", "", "tabList", "Landroidx/compose/ui/Modifier;", "modifier", "S1", "(LJi/M;Lx0/c1;Lps/F;Lps/t;Lcom/meijer/mobile/mperks/ux/V$c;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "pointsBalance", "", "isToAvailablePill", "Lo0/C;", "pagerState", "Lko/d;", "claimTabViewState", "Lqo/M;", "rewardsViewState", "Loo/v;", "earnInProgressState", "pointsBalanceViewState", "showWalkThruBanner", "isDashboardSimplifiedUIEnabled", "Lkotlin/Function0;", "onRetryClicked", "Lkotlin/Function1;", "setWalkThruBannerVisibility", "onViewDisclaimersBottomSheetClick", "onRewardsTabSelected", "onEarnTabSelected", "onClaimTabSelected", "", "onCalculateAboveTabsSectionHeight", "h2", "(LJi/M;ILjava/util/List;ZLo0/C;Lko/d;Lqo/M;Loo/v;Lcom/meijer/mobile/mperks/ux/V$c;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "isPointsBalanceUpdated", "earnTabIndex", "Lbo/c;", "selectedClaimTabPill", "onClaimTabPillSelected", "b2", "(LJi/M;Lo0/C;Ljava/util/List;IZLqo/M;Lko/d;ILbo/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Loo/v;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "Lbo/g;", "navigationRequest", "D3", "(Lbo/g;)V", "Lg/a;", "result", "r3", "(Lg/a;)V", "t3", "(Ljava/util/List;)V", "Lko/c;", "Lqv/O;", "coroutineScope", "C3", "(LJi/M;Lko/c;Lqv/O;)V", "pointBalance", "", "availableRewards", "F3", "(ILjava/util/List;)V", "rewardsInProgressList", "rewardsAvailableList", "Lbo/e;", "tab", "P3", "(ILjava/lang/String;Ljava/lang/String;Lbo/e;)V", "claimRewards", "M3", "Lbo/f;", "earnReward", "isBoosterReward", "navigatedFrom", "isShoppableReward", "B3", "(Lbo/f;ZLjava/lang/String;IZ)V", "rewardId", "R3", "(Ljava/lang/String;Ljava/lang/String;)V", "Lbo/d;", "clippedReward", "E3", "(Lbo/d;)V", "Lbo/b;", "claimReward", "A3", "(Lbo/b;)V", "Q3", "claimAction", "Lbo/a;", "autoClaimReward", "G3", "(Ljava/lang/String;Lbo/a;)V", "selectedClaimSubPill", "K3", "(Lbo/c;I)V", "Lcom/meijer/mobile/mperks/ux/V$b;", "s3", "(Lcom/meijer/mobile/mperks/ux/V$b;)V", "I3", "state", "T3", "N3", "(Ljava/lang/String;)V", "Lcom/meijer/mobile/mperks/ux/V;", "D", "Lkotlin/Lazy;", "m3", "()Lcom/meijer/mobile/mperks/ux/V;", "dashBoardViewModel", "Lqo/I;", "E", "q3", "()Lqo/I;", "rewardsViewModel", "Lko/z;", "F", "l3", "()Lko/z;", "claimTabViewModel", "Loo/a0;", "G", "n3", "()Loo/a0;", "earnTabViewModel", "H", "Lo0/C;", "I", "Lqv/O;", "J", "Z", "isWalkThruTriggered", "Lps/g;", "K", "p3", "()Lps/g;", "navigationHelper", "Lps/L;", "L", "o3", "()Lps/L;", "navigationDrawerViewModel", "M", "Ljava/lang/String;", "previousTrackAction", "N", "mperksPointBalance", "O", "isRewardsTabAnalyticsSent", "P", "isEarnTabAnalyticsSent", "Q", "isClaimTabAnalyticsSent", "R", "S", "navigateFromHomeScreen", "Lg/c;", "T", "Lg/c;", "autoClaimDetailActivityLauncher", "Lcom/fullstory/FSPage;", "kotlin.jvm.PlatformType", "U", "Lcom/fullstory/FSPage;", "fsPage", "V", "Ljava/util/List;", "previewTabList", "x3", "()Z", "isToEarnRewardTab", "w3", "isToClaimRewardsTab", "y3", "isToRewardsTab", "v3", "u3", "isFromLearnToEarn", "W", "a", "expandedBannerHeightPxDynamic", "truncatedBannerHeightPxDynamic", "aboveTabsSectionHeight", "earnPillsIndex", "lastAction", "isDashboardSimplifiedUI", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class MperksDashBoardActivity extends Hilt_MperksDashBoardActivity {

    /* renamed from: X, reason: collision with root package name */
    public static final int f113622X = 8;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private AbstractC15962C pagerState;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private InterfaceC16622O coroutineScope;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private boolean isWalkThruTriggered;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private String previousTrackAction;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private int mperksPointBalance;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private boolean isClaimTabAnalyticsSent;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Lazy dashBoardViewModel = new androidx.view.e0(Reflection.b(V.class), new A(this), new z(this), new B(null, this));

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Lazy rewardsViewModel = new androidx.view.e0(Reflection.b(C16558I.class), new D(this), new C(this), new E(null, this));

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final Lazy claimTabViewModel = new androidx.view.e0(Reflection.b(ko.z.class), new G(this), new F(this), new H(null, this));

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final Lazy earnTabViewModel = new androidx.view.e0(Reflection.b(oo.a0.class), new u(this), new t(this), new v(null, this));

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationHelper = LazyKt.b(new Function0() { // from class: com.meijer.mobile.mperks.ux.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MperksDashBoardActivity.z3(this.f114283a);
        }
    });

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationDrawerViewModel = new androidx.view.e0(Reflection.b(C16382L.class), new x(this), new w(this), new y(null, this));

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean isRewardsTabAnalyticsSent = true;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean isEarnTabAnalyticsSent = true;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private int earnTabIndex = -1;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private boolean navigateFromHomeScreen = true;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> autoClaimDetailActivityLauncher = registerForActivityResult(new h.i(), new j());

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final FSPage fsPage = FS.page("mPerks | Home Page");

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> previewTabList = CollectionsKt.p(Integer.valueOf(j0.f114119E), Integer.valueOf(j0.f114198d0));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class A extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113642f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(ComponentActivity componentActivity) {
            super(0);
            this.f113642f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f113642f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class B extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f113643f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113644g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f113643f = function0;
            this.f113644g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f113643f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f113644g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class C extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113645f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(ComponentActivity componentActivity) {
            super(0);
            this.f113645f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f113645f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class D extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113646f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D(ComponentActivity componentActivity) {
            super(0);
            this.f113646f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f113646f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class E extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f113647f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113648g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public E(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f113647f = function0;
            this.f113648g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f113647f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f113648g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class F extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113649f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(ComponentActivity componentActivity) {
            super(0);
            this.f113649f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f113649f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class G extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113650f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public G(ComponentActivity componentActivity) {
            super(0);
            this.f113650f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f113650f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class H extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f113651f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113652g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f113651f = function0;
            this.f113652g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f113651f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f113652g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$b, reason: case insensitive filesystem */
    static final class C12653b implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f113653a;

        C12653b(LocalThemeScope localThemeScope) {
            this.f113653a = localThemeScope;
        }

        public final void a(InterfaceC14814f ModalBottomSheetLayout, Composer composer, int i10) {
            Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2034044851, i10, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.DashBoardScreen.<anonymous> (MperksDashBoardActivity.kt:389)");
            }
            C15433D.c(this.f113653a, null, composer, LocalThemeScope.f15770g, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            a(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c, reason: case insensitive filesystem */
    static final class C12654c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C17927c1 f113654a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MperksDashBoardActivity f113655b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f113656c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ HeaderDecorator f113657d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ DrawerLayoutDecorator f113658e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d0.V f113659f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5724i0 f113660g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5724i0 f113661h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5724i0 f113662i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ V.PointsBalanceViewState f113663j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f113664k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ List<Integer> f113665l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ C17893M0 f113666m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ z1<ClaimTabState> f113667n;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MperksDashBoardActivity f113668a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113669b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1800a extends FunctionReferenceImpl implements Function0<Unit> {
                C1800a(Object obj) {
                    super(0, obj, C16395g.class, "openDrawer", "openDrawer()V", 0);
                }

                public final void a() {
                    ((C16395g) this.receiver).j();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    a();
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$a$b */
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f113670a;

                b(LocalThemeScope localThemeScope) {
                    this.f113670a = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-813565327, i10, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.DashBoardScreen.<anonymous>.<anonymous>.<anonymous> (MperksDashBoardActivity.kt:403)");
                    }
                    Dr.g.g(this.f113670a, C16193g.c(j0.f114141L0, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1019742799, i10, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.DashBoardScreen.<anonymous>.<anonymous> (MperksDashBoardActivity.kt:401)");
                }
                AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(j0.f114174W0, new Object[0]);
                C.a.s sVar = C.a.s.f15358e;
                C16395g c16395gP3 = this.f113668a.p3();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(c16395gP3);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1800a(c16395gP3);
                    composer.t(objB);
                }
                composer.P();
                LocalThemeScope localThemeScope = this.f113669b;
                Dr.g.f(localThemeScope, null, null, null, ComposableLambdaKt.c(-813565327, true, new b(localThemeScope), composer, 54), (Function0) ((KFunction) objB), sVar, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24576 | (C.a.s.f15359f << 18) | (AbstractC5607a.f45514b << 27), 199);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            a(MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope) {
                this.f113668a = mperksDashBoardActivity;
                this.f113669b = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$b */
        static final class b implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MperksDashBoardActivity f113671a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113672b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ HeaderDecorator f113673c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ DrawerLayoutDecorator f113674d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$b$a */
            /* synthetic */ class a extends FunctionReferenceImpl implements Function1<AbstractC16373C, Unit> {
                a(Object obj) {
                    super(1, obj, C16395g.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/ui/navigation/DrawerNavigationRequest;)V", 0);
                }

                public final void a(AbstractC16373C p02) {
                    Intrinsics.j(p02, "p0");
                    ((C16395g) this.receiver).h(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AbstractC16373C abstractC16373C) {
                    a(abstractC16373C);
                    return Unit.f142422a;
                }
            }

            b(MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope, HeaderDecorator headerDecorator, DrawerLayoutDecorator drawerLayoutDecorator) {
                this.f113671a = mperksDashBoardActivity;
                this.f113672b = localThemeScope;
                this.f113673c = headerDecorator;
                this.f113674d = drawerLayoutDecorator;
            }

            public final void a(InterfaceC14814f Scaffold, Composer composer, int i10) throws XmlPullParserException, Resources.NotFoundException {
                Intrinsics.j(Scaffold, "$this$Scaffold");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1839254329, i10, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.DashBoardScreen.<anonymous>.<anonymous> (MperksDashBoardActivity.kt:411)");
                }
                C16395g c16395gP3 = this.f113671a.p3();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(c16395gP3);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new a(c16395gP3);
                    composer.t(objB);
                }
                composer.P();
                C16372B.h(this.f113672b, this.f113673c, this.f113674d, this.f113671a.q1(), null, (Function1) ((KFunction) objB), composer, LocalThemeScope.f15770g | (HeaderDecorator.f156340i << 3) | (DrawerLayoutDecorator.f156604h << 6), 8);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) throws XmlPullParserException, Resources.NotFoundException {
                a(interfaceC14814f, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$c, reason: collision with other inner class name */
        static final class C1801c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MperksDashBoardActivity f113675a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0.V f113676b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113677c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5724i0 f113678d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5724i0 f113679e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5724i0 f113680f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ HeaderDecorator f113681g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ V.PointsBalanceViewState f113682h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f113683i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ List<Integer> f113684j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ C17893M0 f113685k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ z1<ClaimTabState> f113686l;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$DashBoardScreen$2$3$1$1", f = "MperksDashBoardActivity.kt", l = {432}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$c$a */
            static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f113687a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ d0.V f113688b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ float f113689c;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f113688b, this.f113689c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(d0.V v10, float f10, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f113688b = v10;
                    this.f113689c = f10;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f113687a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        float fO = this.f113688b.o();
                        float f10 = this.f113689c;
                        if (fO >= f10) {
                            this.f113687a = 1;
                            if (d0.V.l(this.f113688b, (int) f10, null, this, 2, null) == objF) {
                                return objF;
                            }
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$DashBoardScreen$2$3$2$1$5$1$1", f = "MperksDashBoardActivity.kt", l = {483}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$c$b */
            static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f113690a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17893M0 f113691b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f113691b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C17893M0 c17893m0, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f113691b = c17893m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f113690a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17893M0 c17893m0 = this.f113691b;
                        this.f113690a = 1;
                        if (c17893m0.l(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$c$c, reason: collision with other inner class name */
            static final class C1802c implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List<Integer> f113692a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ MperksDashBoardActivity f113693b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f113694c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<RewardsViewState> f113695d;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$DashBoardScreen$2$3$2$2$2$1$1$1$1", f = "MperksDashBoardActivity.kt", l = {542}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$c$c$a */
                static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f113696a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ MperksDashBoardActivity f113697b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ int f113698c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(MperksDashBoardActivity mperksDashBoardActivity, int i10, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.f113697b = mperksDashBoardActivity;
                        this.f113698c = i10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new a(this.f113697b, this.f113698c, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f113696a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            AbstractC15962C abstractC15962C = this.f113697b.pagerState;
                            if (abstractC15962C == null) {
                                Intrinsics.y("pagerState");
                                abstractC15962C = null;
                            }
                            int i11 = this.f113698c;
                            this.f113696a = 1;
                            if (AbstractC15962C.n(abstractC15962C, i11, 0.0f, null, this, 6, null) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$c$c$b */
                static final class b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f113699a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ MperksDashBoardActivity f113700b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ int f113701c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ int f113702d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ z1<RewardsViewState> f113703e;

                    b(LocalThemeScope localThemeScope, MperksDashBoardActivity mperksDashBoardActivity, int i10, int i11, z1<RewardsViewState> z1Var) {
                        this.f113699a = localThemeScope;
                        this.f113700b = mperksDashBoardActivity;
                        this.f113701c = i10;
                        this.f113702d = i11;
                        this.f113703e = z1Var;
                    }

                    public final void a(Composer composer, int i10) throws Resources.NotFoundException {
                        String strC;
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1555619047, i10, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.DashBoardScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MperksDashBoardActivity.kt:545)");
                        }
                        LocalThemeScope localThemeScope = this.f113699a;
                        Ji.I seven = localThemeScope.getAdsTypography().getHeadings().getSeven();
                        AbstractC15962C abstractC15962C = this.f113700b.pagerState;
                        if (abstractC15962C == null) {
                            Intrinsics.y("pagerState");
                            abstractC15962C = null;
                        }
                        q1.Label label = new q1.Label(null, abstractC15962C.v() == this.f113701c ? this.f113699a.getAdsColors().getAdsColorText03() : this.f113699a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, seven, null, 349, null);
                        if (this.f113702d == j0.f114124F1) {
                            composer.startReplaceGroup(-749035072);
                            if (C1801c.s(this.f113703e).c().isEmpty()) {
                                composer.startReplaceGroup(-748501469);
                                strC = C16193g.c(j0.f114127G1, composer, 0);
                                composer.P();
                            } else {
                                composer.startReplaceGroup(-748945017);
                                strC = C16193g.d(this.f113702d, new Object[]{String.valueOf(C1801c.s(this.f113703e).c().size())}, composer, 0);
                                composer.P();
                            }
                            composer.P();
                        } else {
                            composer.startReplaceGroup(-301232781);
                            strC = C16193g.c(this.f113702d, composer, 0);
                            composer.P();
                        }
                        ri.j.h(localThemeScope, label, strC, null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                        a(composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                C1802c(List<Integer> list, MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope, z1<RewardsViewState> z1Var) {
                    this.f113692a = list;
                    this.f113693b = mperksDashBoardActivity;
                    this.f113694c = localThemeScope;
                    this.f113695d = z1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(int i10, MperksDashBoardActivity mperksDashBoardActivity, int i11) {
                    InterfaceC16622O interfaceC16622O;
                    if (i10 == j0.f114124F1) {
                        mperksDashBoardActivity.isRewardsTabAnalyticsSent = false;
                    } else if (i10 == j0.f114198d0) {
                        mperksDashBoardActivity.isEarnTabAnalyticsSent = false;
                    } else if (i10 == j0.f114119E) {
                        mperksDashBoardActivity.isClaimTabAnalyticsSent = false;
                    }
                    InterfaceC16622O interfaceC16622O2 = mperksDashBoardActivity.coroutineScope;
                    if (interfaceC16622O2 == null) {
                        Intrinsics.y("coroutineScope");
                        interfaceC16622O = null;
                    } else {
                        interfaceC16622O = interfaceC16622O2;
                    }
                    C16648k.d(interfaceC16622O, null, null, new a(mperksDashBoardActivity, i11, null), 3, null);
                    return Unit.f142422a;
                }

                public final void b(Composer composer, int i10) {
                    Composer composer2 = composer;
                    if ((i10 & 3) == 2 && composer2.j()) {
                        composer2.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(165873543, i10, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.DashBoardScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MperksDashBoardActivity.kt:523)");
                    }
                    List<Integer> list = this.f113692a;
                    final MperksDashBoardActivity mperksDashBoardActivity = this.f113693b;
                    LocalThemeScope localThemeScope = this.f113694c;
                    z1<RewardsViewState> z1Var = this.f113695d;
                    final int i11 = 0;
                    for (Object obj : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.w();
                        }
                        final int iIntValue = ((Number) obj).intValue();
                        AbstractC15962C abstractC15962C = mperksDashBoardActivity.pagerState;
                        if (abstractC15962C == null) {
                            Intrinsics.y("pagerState");
                            abstractC15962C = null;
                        }
                        boolean z10 = i11 == abstractC15962C.v();
                        long color = localThemeScope.getAdsColors().getAdsColorText01().getColor();
                        long color2 = localThemeScope.getAdsColors().getAdsColorActive01().getColor();
                        Modifier modifierD = androidx.compose.foundation.b.d(Modifier.INSTANCE, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null);
                        composer2.startReplaceGroup(-1746271574);
                        boolean zD = composer2.d(iIntValue) | composer2.D(mperksDashBoardActivity) | composer2.d(i11);
                        Object objB = composer2.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.mperks.ux.F
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MperksDashBoardActivity.C12654c.C1801c.C1802c.c(iIntValue, mperksDashBoardActivity, i11);
                                }
                            };
                            composer2.t(objB);
                        }
                        composer2.P();
                        A1.b(z10, (Function0) objB, modifierD, false, ComposableLambdaKt.c(-1555619047, true, new b(localThemeScope, mperksDashBoardActivity, i11, iIntValue, z1Var), composer2, 54), null, null, color2, color, composer2, 24576, 104);
                        composer2 = composer;
                        i11 = i12;
                        mperksDashBoardActivity = mperksDashBoardActivity;
                        localThemeScope = localThemeScope;
                        z1Var = z1Var;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$DashBoardScreen$2$3$3$1", f = "MperksDashBoardActivity.kt", l = {580}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$c$d */
            static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f113704a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f113705b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ MperksDashBoardActivity f113706c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f113707d;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lko/c;", "it", "", "<anonymous>", "(Lko/c;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$DashBoardScreen$2$3$3$1$1", f = "MperksDashBoardActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$c$d$a */
                static final class a extends SuspendLambda implements Function2<AbstractC15202c, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f113708a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f113709b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ MperksDashBoardActivity f113710c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f113711d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ InterfaceC16622O f113712e;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        a aVar = new a(this.f113710c, this.f113711d, this.f113712e, continuation);
                        aVar.f113709b = obj;
                        return aVar;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope, InterfaceC16622O interfaceC16622O, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.f113710c = mperksDashBoardActivity;
                        this.f113711d = localThemeScope;
                        this.f113712e = interfaceC16622O;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(AbstractC15202c abstractC15202c, Continuation<? super Unit> continuation) {
                        return ((a) create(abstractC15202c, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.f();
                        if (this.f113708a == 0) {
                            ResultKt.b(obj);
                            this.f113710c.C3(this.f113711d, (AbstractC15202c) this.f113709b, this.f113712e);
                            return Unit.f142422a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    d dVar = new d(this.f113706c, this.f113707d, continuation);
                    dVar.f113705b = obj;
                    return dVar;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f113706c = mperksDashBoardActivity;
                    this.f113707d = localThemeScope;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f113704a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f113705b;
                        InterfaceC17152f interfaceC17152fO = C17154h.O(this.f113706c.l3().B(), new a(this.f113706c, this.f113707d, interfaceC16622O, null));
                        this.f113705b = interfaceC16622O;
                        this.f113704a = 1;
                        if (C17154h.j(interfaceC17152fO, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit w(MperksDashBoardActivity mperksDashBoardActivity) {
                mperksDashBoardActivity.isRewardsTabAnalyticsSent = false;
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit x(MperksDashBoardActivity mperksDashBoardActivity) {
                mperksDashBoardActivity.isEarnTabAnalyticsSent = false;
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit y(MperksDashBoardActivity mperksDashBoardActivity) {
                mperksDashBoardActivity.isClaimTabAnalyticsSent = false;
                return Unit.f142422a;
            }

            C1801c(MperksDashBoardActivity mperksDashBoardActivity, d0.V v10, LocalThemeScope localThemeScope, InterfaceC5724i0 interfaceC5724i0, InterfaceC5724i0 interfaceC5724i02, InterfaceC5724i0 interfaceC5724i03, HeaderDecorator headerDecorator, V.PointsBalanceViewState pointsBalanceViewState, boolean z10, List<Integer> list, C17893M0 c17893m0, z1<ClaimTabState> z1Var) {
                this.f113675a = mperksDashBoardActivity;
                this.f113676b = v10;
                this.f113677c = localThemeScope;
                this.f113678d = interfaceC5724i0;
                this.f113679e = interfaceC5724i02;
                this.f113680f = interfaceC5724i03;
                this.f113681g = headerDecorator;
                this.f113682h = pointsBalanceViewState;
                this.f113683i = z10;
                this.f113684j = list;
                this.f113685k = c17893m0;
                this.f113686l = z1Var;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) throws NumberFormatException {
                q(interfaceC14794C, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX WARN: Removed duplicated region for block: B:100:0x03ce  */
            /* JADX WARN: Removed duplicated region for block: B:102:0x03d4  */
            /* JADX WARN: Removed duplicated region for block: B:105:0x03f3  */
            /* JADX WARN: Removed duplicated region for block: B:108:0x0465  */
            /* JADX WARN: Removed duplicated region for block: B:111:0x0471  */
            /* JADX WARN: Removed duplicated region for block: B:112:0x0475  */
            /* JADX WARN: Removed duplicated region for block: B:115:0x0494  */
            /* JADX WARN: Removed duplicated region for block: B:117:0x04a2  */
            /* JADX WARN: Removed duplicated region for block: B:120:0x04c6  */
            /* JADX WARN: Removed duplicated region for block: B:125:0x0508  */
            /* JADX WARN: Removed duplicated region for block: B:128:0x0517  */
            /* JADX WARN: Removed duplicated region for block: B:132:0x0529  */
            /* JADX WARN: Removed duplicated region for block: B:135:0x053a  */
            /* JADX WARN: Removed duplicated region for block: B:141:0x05aa  */
            /* JADX WARN: Removed duplicated region for block: B:143:0x05b0  */
            /* JADX WARN: Removed duplicated region for block: B:146:0x05c8  */
            /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:80:0x0337  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x035c  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x0365  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0384  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x038a  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x03a9  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x03af  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void q(j0.InterfaceC14794C r40, androidx.compose.runtime.Composer r41, int r42) throws java.lang.NumberFormatException {
                /*
                    Method dump skipped, instructions count: 1484
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.MperksDashBoardActivity.C12654c.C1801c.q(j0.C, androidx.compose.runtime.Composer, int):void");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit A(InterfaceC5724i0 interfaceC5724i0, float f10) {
                MperksDashBoardActivity.X1(interfaceC5724i0, f10);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit B(MperksDashBoardActivity mperksDashBoardActivity) {
                mperksDashBoardActivity.m3().D(V.a.l.f113831a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit C(InterfaceC5724i0 interfaceC5724i0, float f10) {
                MperksDashBoardActivity.Z1(interfaceC5724i0, f10);
                return Unit.f142422a;
            }

            private static final boolean D(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                return interfaceC5730l0.getValue().booleanValue();
            }

            private static final void E(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                interfaceC5730l0.setValue(Boolean.valueOf(z10));
            }

            private static final EarnInProgressState r(z1<EarnInProgressState> z1Var) {
                return z1Var.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final RewardsViewState s(z1<RewardsViewState> z1Var) {
                return z1Var.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit t(MperksDashBoardActivity mperksDashBoardActivity) {
                mperksDashBoardActivity.q3().s(AbstractC16581o.c.f157441a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit u(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                E(interfaceC5730l0, z10);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit v(MperksDashBoardActivity mperksDashBoardActivity, C17893M0 c17893m0) {
                InterfaceC16622O interfaceC16622O;
                InterfaceC16622O interfaceC16622O2 = mperksDashBoardActivity.coroutineScope;
                if (interfaceC16622O2 == null) {
                    Intrinsics.y("coroutineScope");
                    interfaceC16622O = null;
                } else {
                    interfaceC16622O = interfaceC16622O2;
                }
                C16648k.d(interfaceC16622O, null, null, new b(c17893m0, null), 3, null);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit z(InterfaceC5724i0 interfaceC5724i0, float f10) {
                MperksDashBoardActivity.U1(interfaceC5724i0, f10);
                return Unit.f142422a;
            }
        }

        C12654c(C17927c1 c17927c1, MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope, HeaderDecorator headerDecorator, DrawerLayoutDecorator drawerLayoutDecorator, d0.V v10, InterfaceC5724i0 interfaceC5724i0, InterfaceC5724i0 interfaceC5724i02, InterfaceC5724i0 interfaceC5724i03, V.PointsBalanceViewState pointsBalanceViewState, boolean z10, List<Integer> list, C17893M0 c17893m0, z1<ClaimTabState> z1Var) {
            this.f113654a = c17927c1;
            this.f113655b = mperksDashBoardActivity;
            this.f113656c = localThemeScope;
            this.f113657d = headerDecorator;
            this.f113658e = drawerLayoutDecorator;
            this.f113659f = v10;
            this.f113660g = interfaceC5724i0;
            this.f113661h = interfaceC5724i02;
            this.f113662i = interfaceC5724i03;
            this.f113663j = pointsBalanceViewState;
            this.f113664k = z10;
            this.f113665l = list;
            this.f113666m = c17893m0;
            this.f113667n = z1Var;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-594234196, i10, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.DashBoardScreen.<anonymous> (MperksDashBoardActivity.kt:398)");
            }
            C17921a1.a(null, this.f113654a, ComposableLambdaKt.c(-1019742799, true, new a(this.f113655b, this.f113656c), composer, 54), null, null, null, 0, false, ComposableLambdaKt.c(-1839254329, true, new b(this.f113655b, this.f113656c, this.f113657d, this.f113658e), composer, 54), false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-1087691030, true, new C1801c(this.f113655b, this.f113659f, this.f113656c, this.f113660g, this.f113661h, this.f113662i, this.f113657d, this.f113663j, this.f113664k, this.f113665l, this.f113666m, this.f113667n), composer, 54), composer, 100663680, 12582912, 130809);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$d, reason: case insensitive filesystem */
    static final class C12655d implements Function4<InterfaceC15985u, Integer, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<Integer> f113713a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MperksDashBoardActivity f113714b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f113715c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ RewardsViewState f113716d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ PointsExpState f113717e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f113718f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f113719g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ EarnAvailableViewState f113720h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ MccEnrollmentState f113721i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ EarnInProgressState f113722j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f113723k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f113724l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f113725m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ClaimTabState f113726n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ EnumC6273c f113727o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC6273c, Unit> f113728p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$d$a */
        /* synthetic */ class a extends FunctionReferenceImpl implements Function1<bo.g, Unit> {
            a(Object obj) {
                super(1, obj, MperksDashBoardActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/mperks/model/common/MperksNavigationRequest;)V", 0);
            }

            public final void a(bo.g p02) {
                Intrinsics.j(p02, "p0");
                ((MperksDashBoardActivity) this.receiver).D3(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(bo.g gVar) {
                a(gVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$d$b */
        /* synthetic */ class b extends FunctionReferenceImpl implements Function1<bo.g, Unit> {
            b(Object obj) {
                super(1, obj, MperksDashBoardActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/mperks/model/common/MperksNavigationRequest;)V", 0);
            }

            public final void a(bo.g p02) {
                Intrinsics.j(p02, "p0");
                ((MperksDashBoardActivity) this.receiver).D3(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(bo.g gVar) {
                a(gVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$d$c */
        /* synthetic */ class c extends FunctionReferenceImpl implements Function1<bo.g, Unit> {
            c(Object obj) {
                super(1, obj, MperksDashBoardActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/mperks/model/common/MperksNavigationRequest;)V", 0);
            }

            public final void a(bo.g p02) {
                Intrinsics.j(p02, "p0");
                ((MperksDashBoardActivity) this.receiver).D3(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(bo.g gVar) {
                a(gVar);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C12655d(List<Integer> list, MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope, RewardsViewState rewardsViewState, PointsExpState pointsExpState, Function0<Unit> function0, boolean z10, EarnAvailableViewState earnAvailableViewState, MccEnrollmentState mccEnrollmentState, EarnInProgressState earnInProgressState, int i10, Function1<? super Integer, Unit> function1, int i11, ClaimTabState claimTabState, EnumC6273c enumC6273c, Function1<? super EnumC6273c, Unit> function12) {
            this.f113713a = list;
            this.f113714b = mperksDashBoardActivity;
            this.f113715c = localThemeScope;
            this.f113716d = rewardsViewState;
            this.f113717e = pointsExpState;
            this.f113718f = function0;
            this.f113719g = z10;
            this.f113720h = earnAvailableViewState;
            this.f113721i = mccEnrollmentState;
            this.f113722j = earnInProgressState;
            this.f113723k = i10;
            this.f113724l = function1;
            this.f113725m = i11;
            this.f113726n = claimTabState;
            this.f113727o = enumC6273c;
            this.f113728p = function12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(MperksDashBoardActivity mperksDashBoardActivity, GoogleAdAnalytics googleAnalytics) {
            Intrinsics.j(googleAnalytics, "googleAnalytics");
            mperksDashBoardActivity.m3().D(new V.a.GoogleAdClicked(googleAnalytics));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(MperksDashBoardActivity mperksDashBoardActivity, ClaimTabState claimTabState, bo.h action) {
            Intrinsics.j(action, "action");
            if (Intrinsics.e(action, h.m.f60578a)) {
                int i10 = mperksDashBoardActivity.mperksPointBalance;
                List<ClaimReward> listD = claimTabState.d();
                ArrayList arrayList = new ArrayList(CollectionsKt.x(listD, 10));
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((ClaimReward) it.next()).getCouponId()));
                }
                mperksDashBoardActivity.M3(i10, arrayList);
            } else if (action instanceof h.BuyReward) {
                mperksDashBoardActivity.l3().E(new AbstractC15200a.BuyReward(((h.BuyReward) action).getClaimReward()));
            } else if (action instanceof h.AutoClaimEnroll) {
                h.AutoClaimEnroll autoClaimEnroll = (h.AutoClaimEnroll) action;
                mperksDashBoardActivity.l3().E(new AbstractC15200a.AutoClaimAction(autoClaimEnroll.getEnroll(), autoClaimEnroll.getAutoClaimType(), autoClaimEnroll.getAutoClaimAmount()));
            } else if (action instanceof h.TrackAutoClaimAction) {
                h.TrackAutoClaimAction trackAutoClaimAction = (h.TrackAutoClaimAction) action;
                mperksDashBoardActivity.G3(trackAutoClaimAction.getClaimAction(), trackAutoClaimAction.getAutoClaimReward());
            } else if (action instanceof h.OnConfirmingSwitchClick) {
                h.OnConfirmingSwitchClick onConfirmingSwitchClick = (h.OnConfirmingSwitchClick) action;
                mperksDashBoardActivity.l3().E(new AbstractC15200a.ShowSwitchingButtonsAction(onConfirmingSwitchClick.getIsShowSwitchingButtons(), onConfirmingSwitchClick.getAutoClaimReward()));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(boolean z10, RewardsViewState rewardsViewState, MperksDashBoardActivity mperksDashBoardActivity, bo.h action) {
            Intrinsics.j(action, "action");
            if (Intrinsics.e(action, h.o.f60580a) && z10 && rewardsViewState.getIsRewardsUpdated() && (!mperksDashBoardActivity.isRewardsTabAnalyticsSent || (mperksDashBoardActivity.navigateFromHomeScreen && !mperksDashBoardActivity.u3()))) {
                int i10 = mperksDashBoardActivity.mperksPointBalance;
                List<ClippedReward> listC = rewardsViewState.c();
                ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
                Iterator<T> it = listC.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((ClippedReward) it.next()).getRewardId()));
                }
                mperksDashBoardActivity.F3(i10, arrayList);
                mperksDashBoardActivity.navigateFromHomeScreen = false;
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(EarnAvailableViewState earnAvailableViewState, EarnInProgressState earnInProgressState, MperksDashBoardActivity mperksDashBoardActivity, int i10, Function1 function1, bo.h action) {
            Intrinsics.j(action, "action");
            if (action instanceof h.TrackEarnPillState) {
                mperksDashBoardActivity.P3(i10, CollectionsKt.B0(earnInProgressState.d(), ",", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.mperks.ux.L
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MperksDashBoardActivity.C12655d.r((EarnReward) obj);
                    }
                }, 30, null), CollectionsKt.B0(earnAvailableViewState.c(), ",", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.mperks.ux.K
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MperksDashBoardActivity.C12655d.q((EarnReward) obj);
                    }
                }, 30, null), ((h.TrackEarnPillState) action).getEarnPills());
            } else if (action instanceof h.EarnTabAnalyticsFlagUpdate) {
                h.EarnTabAnalyticsFlagUpdate earnTabAnalyticsFlagUpdate = (h.EarnTabAnalyticsFlagUpdate) action;
                mperksDashBoardActivity.isEarnTabAnalyticsSent = earnTabAnalyticsFlagUpdate.getIsEarnTabAnalyticsSent();
                function1.invoke(Integer.valueOf(earnTabAnalyticsFlagUpdate.getTab().ordinal()));
                mperksDashBoardActivity.fsPage.updateProperties(MapsKt.g(TuplesKt.a("earnCategory", earnTabAnalyticsFlagUpdate.getTab().name())));
            } else if (action instanceof h.EarnRewardCardClicked) {
                h.EarnRewardCardClicked earnRewardCardClicked = (h.EarnRewardCardClicked) action;
                mperksDashBoardActivity.B3(earnRewardCardClicked.getEarnReward(), earnRewardCardClicked.getIsBoosterReward(), earnRewardCardClicked.getNavigatedFrom(), i10, earnRewardCardClicked.getIsShoppableReward());
            } else if (action instanceof h.OnTrackShopNowButtonClick) {
                mperksDashBoardActivity.R3(((h.OnTrackShopNowButtonClick) action).getRewardId(), String.valueOf(i10));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence q(EarnReward it) {
            Intrinsics.j(it, "it");
            return String.valueOf(it.getRewardId());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence r(EarnReward it) {
            Intrinsics.j(it, "it");
            return String.valueOf(it.getRewardId());
        }

        public final void g(InterfaceC15985u HorizontalPager, int i10, Composer composer, int i11) {
            Intrinsics.j(HorizontalPager, "$this$HorizontalPager");
            if (ComposerKt.M()) {
                ComposerKt.U(-1101263701, i11, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.NavigationComponent.<anonymous>.<anonymous> (MperksDashBoardActivity.kt:769)");
            }
            int iIntValue = this.f113713a.get(i10).intValue();
            if (iIntValue == j0.f114124F1) {
                composer.startReplaceGroup(1508415972);
                MperksDashBoardActivity mperksDashBoardActivity = this.f113714b;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(mperksDashBoardActivity);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new a(mperksDashBoardActivity);
                    composer.t(objB);
                }
                KFunction kFunction = (KFunction) objB;
                composer.P();
                LocalThemeScope localThemeScope = this.f113715c;
                RewardsViewState rewardsViewState = this.f113716d;
                PointsExpState pointsExpState = this.f113717e;
                Function0<Unit> function0 = this.f113718f;
                Function1 function1 = (Function1) kFunction;
                composer.startReplaceGroup(-1746271574);
                boolean zA = composer.a(this.f113719g) | composer.V(this.f113716d) | composer.D(this.f113714b);
                final boolean z10 = this.f113719g;
                final RewardsViewState rewardsViewState2 = this.f113716d;
                final MperksDashBoardActivity mperksDashBoardActivity2 = this.f113714b;
                Object objB2 = composer.B();
                if (zA || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.mperks.ux.G
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MperksDashBoardActivity.C12655d.o(z10, rewardsViewState2, mperksDashBoardActivity2, (bo.h) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                C16551B.w(localThemeScope, rewardsViewState, pointsExpState, null, function0, function1, (Function1) objB2, composer, LocalThemeScope.f15770g, 4);
                composer.P();
            } else if (iIntValue == j0.f114198d0) {
                composer.startReplaceGroup(1510628752);
                boolean zE = this.f113714b.s1().e(AbstractC18227f.I.f170548h);
                MperksDashBoardActivity mperksDashBoardActivity3 = this.f113714b;
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(mperksDashBoardActivity3);
                Object objB3 = composer.B();
                if (zD2 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new b(mperksDashBoardActivity3);
                    composer.t(objB3);
                }
                KFunction kFunction2 = (KFunction) objB3;
                composer.P();
                GoogleAdData googleAdData = this.f113720h.getGoogleAdData();
                LocalThemeScope localThemeScope2 = this.f113715c;
                PointsExpState pointsExpState2 = this.f113717e;
                EarnAvailableViewState earnAvailableViewState = this.f113720h;
                MccEnrollmentState mccEnrollmentState = this.f113721i;
                EarnInProgressState earnInProgressState = this.f113722j;
                int i12 = this.f113723k;
                Function1<Integer, Unit> function12 = this.f113724l;
                Function0<Unit> function02 = this.f113718f;
                Function1 function13 = (Function1) kFunction2;
                composer.startReplaceGroup(-1224400529);
                boolean zD3 = composer.D(this.f113720h) | composer.D(this.f113722j) | composer.D(this.f113714b) | composer.d(this.f113725m) | composer.V(this.f113724l);
                final EarnAvailableViewState earnAvailableViewState2 = this.f113720h;
                final EarnInProgressState earnInProgressState2 = this.f113722j;
                final MperksDashBoardActivity mperksDashBoardActivity4 = this.f113714b;
                final int i13 = this.f113725m;
                final Function1<Integer, Unit> function14 = this.f113724l;
                Object objB4 = composer.B();
                if (zD3 || objB4 == Composer.INSTANCE.a()) {
                    Function1 function15 = new Function1() { // from class: com.meijer.mobile.mperks.ux.H
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MperksDashBoardActivity.C12655d.p(earnAvailableViewState2, earnInProgressState2, mperksDashBoardActivity4, i13, function14, (bo.h) obj);
                        }
                    };
                    composer.t(function15);
                    objB4 = function15;
                }
                Function1 function16 = (Function1) objB4;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD4 = composer.D(this.f113714b);
                final MperksDashBoardActivity mperksDashBoardActivity5 = this.f113714b;
                Object objB5 = composer.B();
                if (zD4 || objB5 == Composer.INSTANCE.a()) {
                    objB5 = new Function1() { // from class: com.meijer.mobile.mperks.ux.I
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MperksDashBoardActivity.C12655d.k(mperksDashBoardActivity5, (GoogleAdAnalytics) obj);
                        }
                    };
                    composer.t(objB5);
                }
                composer.P();
                oo.W.i(localThemeScope2, pointsExpState2, earnAvailableViewState, mccEnrollmentState, earnInProgressState, i12, zE, null, googleAdData, function12, function02, function13, function16, (Function1) objB5, composer, LocalThemeScope.f15770g | (GoogleAdData.f131149f << 24), 0, 64);
                composer.P();
            } else {
                composer.startReplaceGroup(1514568945);
                boolean zE2 = this.f113714b.s1().e(AbstractC18227f.I.f170548h);
                MperksDashBoardActivity mperksDashBoardActivity6 = this.f113714b;
                composer.startReplaceGroup(5004770);
                boolean zD5 = composer.D(mperksDashBoardActivity6);
                Object objB6 = composer.B();
                if (zD5 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new c(mperksDashBoardActivity6);
                    composer.t(objB6);
                }
                KFunction kFunction3 = (KFunction) objB6;
                composer.P();
                LocalThemeScope localThemeScope3 = this.f113715c;
                int i14 = this.f113725m;
                ClaimTabState claimTabState = this.f113726n;
                PointsExpState pointsExpState3 = this.f113717e;
                EnumC6273c enumC6273c = this.f113727o;
                Function0<Unit> function03 = this.f113718f;
                Function1<EnumC6273c, Unit> function17 = this.f113728p;
                Function1 function18 = (Function1) kFunction3;
                composer.startReplaceGroup(-1633490746);
                boolean zD6 = composer.D(this.f113714b) | composer.V(this.f113726n);
                final MperksDashBoardActivity mperksDashBoardActivity7 = this.f113714b;
                final ClaimTabState claimTabState2 = this.f113726n;
                Object objB7 = composer.B();
                if (zD6 || objB7 == Composer.INSTANCE.a()) {
                    objB7 = new Function1() { // from class: com.meijer.mobile.mperks.ux.J
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MperksDashBoardActivity.C12655d.l(mperksDashBoardActivity7, claimTabState2, (bo.h) obj);
                        }
                    };
                    composer.t(objB7);
                }
                composer.P();
                ko.u.H(localThemeScope3, i14, claimTabState, pointsExpState3, enumC6273c, zE2, null, function03, function17, function18, (Function1) objB7, composer, LocalThemeScope.f15770g, 0, 32);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15985u interfaceC15985u, Integer num, Composer composer, Integer num2) {
            g(interfaceC15985u, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/meijer/mobile/mperks/ux/MperksDashBoardActivity$e", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$e, reason: case insensitive filesystem */
    public static final class C12656e implements androidx.compose.runtime.E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6023l f113729a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6027p f113730b;

        public C12656e(AbstractC6023l abstractC6023l, InterfaceC6027p interfaceC6027p) {
            this.f113729a = abstractC6023l;
            this.f113730b = interfaceC6027p;
        }

        @Override // androidx.compose.runtime.E
        public void dispose() {
            this.f113729a.d(this.f113730b);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$f, reason: case insensitive filesystem */
    /* synthetic */ class C12657f extends FunctionReferenceImpl implements Function1<bo.g, Unit> {
        C12657f(Object obj) {
            super(1, obj, MperksDashBoardActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/mperks/model/common/MperksNavigationRequest;)V", 0);
        }

        public final void a(bo.g p02) {
            Intrinsics.j(p02, "p0");
            ((MperksDashBoardActivity) this.receiver).D3(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(bo.g gVar) {
            a(gVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$TabStructureLayout$5$4$1", f = "MperksDashBoardActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$g, reason: case insensitive filesystem */
    static final class C12658g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113731a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<Integer> f113732b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f113733c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MperksDashBoardActivity f113734d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f113735e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f113736f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f113737g;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C12658g(this.f113732b, this.f113733c, this.f113734d, this.f113735e, this.f113736f, this.f113737g, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12658g(List<Integer> list, AbstractC15962C abstractC15962C, MperksDashBoardActivity mperksDashBoardActivity, boolean z10, int i10, InterfaceC5726j0 interfaceC5726j0, Continuation<? super C12658g> continuation) {
            super(2, continuation);
            this.f113732b = list;
            this.f113733c = abstractC15962C;
            this.f113734d = mperksDashBoardActivity;
            this.f113735e = z10;
            this.f113736f = i10;
            this.f113737g = interfaceC5726j0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12658g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i10;
            IntrinsicsKt.f();
            if (this.f113731a == 0) {
                ResultKt.b(obj);
                Integer num = (Integer) CollectionsKt.v0(this.f113732b, this.f113733c.v());
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (iIntValue == j0.f114124F1) {
                        this.f113734d.fsPage.updateProperties(MapsKt.g(TuplesKt.a("mPerks_tab", "Rewards")));
                    } else if (iIntValue == j0.f114198d0) {
                        InterfaceC5726j0 interfaceC5726j0 = this.f113737g;
                        if (this.f113735e) {
                            i10 = this.f113736f;
                        } else {
                            i10 = 0;
                        }
                        MperksDashBoardActivity.p2(interfaceC5726j0, i10);
                        this.f113734d.fsPage.updateProperties(MapsKt.g(TuplesKt.a("mPerks_tab", "Earn")));
                    } else if (iIntValue == j0.f114119E) {
                        this.f113734d.fsPage.updateProperties(MapsKt.g(TuplesKt.a("mPerks_tab", "Claim")));
                    }
                    return Unit.f142422a;
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$h, reason: case insensitive filesystem */
    static final class C12659h implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<Integer> f113738a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f113739b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f113740c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f113741d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f113742e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f113743f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ MperksDashBoardActivity f113744g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ RewardsViewState f113745h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$TabStructureLayout$5$5$1$1$1$1$1", f = "MperksDashBoardActivity.kt", l = {681}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$h$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f113746a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC15962C f113747b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f113748c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f113747b, this.f113748c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC15962C abstractC15962C, int i10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f113747b = abstractC15962C;
                this.f113748c = i10;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f113746a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    AbstractC15962C abstractC15962C = this.f113747b;
                    int i11 = this.f113748c;
                    this.f113746a = 1;
                    if (AbstractC15962C.n(abstractC15962C, i11, 0.0f, null, this, 6, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$h$b */
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113749a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC15962C f113750b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f113751c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f113752d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ RewardsViewState f113753e;

            b(LocalThemeScope localThemeScope, AbstractC15962C abstractC15962C, int i10, int i11, RewardsViewState rewardsViewState) {
                this.f113749a = localThemeScope;
                this.f113750b = abstractC15962C;
                this.f113751c = i10;
                this.f113752d = i11;
                this.f113753e = rewardsViewState;
            }

            public final void a(Composer composer, int i10) throws Resources.NotFoundException {
                String strC;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1900948008, i10, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.TabStructureLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MperksDashBoardActivity.kt:684)");
                }
                LocalThemeScope localThemeScope = this.f113749a;
                q1.Label label = new q1.Label(null, this.f113750b.v() == this.f113751c ? this.f113749a.getAdsColors().getAdsColorText03() : this.f113749a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 349, null);
                if (this.f113752d == j0.f114124F1) {
                    composer.startReplaceGroup(1998997638);
                    if (this.f113753e.c().isEmpty()) {
                        composer.startReplaceGroup(1999373172);
                        strC = C16193g.c(j0.f114127G1, composer, 0);
                        composer.P();
                    } else {
                        composer.startReplaceGroup(1999073805);
                        strC = C16193g.d(this.f113752d, new Object[]{String.valueOf(this.f113753e.c().size())}, composer, 0);
                        composer.P();
                    }
                    composer.P();
                } else {
                    composer.startReplaceGroup(1449974818);
                    strC = C16193g.c(this.f113752d, composer, 0);
                    composer.P();
                }
                ri.j.h(localThemeScope, label, strC, null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        C12659h(List<Integer> list, AbstractC15962C abstractC15962C, LocalThemeScope localThemeScope, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, MperksDashBoardActivity mperksDashBoardActivity, RewardsViewState rewardsViewState) {
            this.f113738a = list;
            this.f113739b = abstractC15962C;
            this.f113740c = localThemeScope;
            this.f113741d = function0;
            this.f113742e = function02;
            this.f113743f = function03;
            this.f113744g = mperksDashBoardActivity;
            this.f113745h = rewardsViewState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(int i10, Function0 function0, Function0 function02, Function0 function03, MperksDashBoardActivity mperksDashBoardActivity, AbstractC15962C abstractC15962C, int i11) {
            InterfaceC16622O interfaceC16622O;
            if (i10 == j0.f114124F1) {
                function0.invoke();
            } else if (i10 == j0.f114198d0) {
                function02.invoke();
            } else if (i10 == j0.f114119E) {
                function03.invoke();
            }
            InterfaceC16622O interfaceC16622O2 = mperksDashBoardActivity.coroutineScope;
            if (interfaceC16622O2 == null) {
                Intrinsics.y("coroutineScope");
                interfaceC16622O = null;
            } else {
                interfaceC16622O = interfaceC16622O2;
            }
            C16648k.d(interfaceC16622O, null, null, new a(abstractC15962C, i11, null), 3, null);
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            final AbstractC15962C abstractC15962C;
            Function0<Unit> function0;
            Function0<Unit> function02;
            Function0<Unit> function03;
            MperksDashBoardActivity mperksDashBoardActivity;
            int i11;
            Composer composer2 = composer;
            if ((i10 & 3) == 2 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1377890810, i10, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.TabStructureLayout.<anonymous>.<anonymous>.<anonymous> (MperksDashBoardActivity.kt:670)");
            }
            List<Integer> list = this.f113738a;
            AbstractC15962C abstractC15962C2 = this.f113739b;
            LocalThemeScope localThemeScope = this.f113740c;
            Function0<Unit> function04 = this.f113741d;
            final Function0<Unit> function05 = this.f113742e;
            final Function0<Unit> function06 = this.f113743f;
            final MperksDashBoardActivity mperksDashBoardActivity2 = this.f113744g;
            RewardsViewState rewardsViewState = this.f113745h;
            final int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.w();
                }
                final int iIntValue = ((Number) obj).intValue();
                boolean z10 = i12 == abstractC15962C2.v();
                long color = localThemeScope.getAdsColors().getAdsColorText01().getColor();
                long color2 = localThemeScope.getAdsColors().getAdsColorActive01().getColor();
                Modifier modifierD = androidx.compose.foundation.b.d(Modifier.INSTANCE, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null);
                composer2.startReplaceGroup(-1224400529);
                boolean zD = composer2.d(iIntValue) | composer2.V(function04) | composer2.V(function05) | composer2.V(function06) | composer2.D(mperksDashBoardActivity2) | composer2.V(abstractC15962C2) | composer2.d(i12);
                Object objB = composer2.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    abstractC15962C = abstractC15962C2;
                    final Function0<Unit> function07 = function04;
                    Function0 function08 = new Function0() { // from class: com.meijer.mobile.mperks.ux.M
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MperksDashBoardActivity.C12659h.c(iIntValue, function07, function05, function06, mperksDashBoardActivity2, abstractC15962C, i12);
                        }
                    };
                    function0 = function07;
                    function02 = function05;
                    function03 = function06;
                    mperksDashBoardActivity = mperksDashBoardActivity2;
                    i11 = i12;
                    composer2.t(function08);
                    objB = function08;
                } else {
                    function0 = function04;
                    abstractC15962C = abstractC15962C2;
                    function02 = function05;
                    function03 = function06;
                    mperksDashBoardActivity = mperksDashBoardActivity2;
                    i11 = i12;
                }
                composer2.P();
                AbstractC15962C abstractC15962C3 = abstractC15962C;
                LocalThemeScope localThemeScope2 = localThemeScope;
                RewardsViewState rewardsViewState2 = rewardsViewState;
                A1.b(z10, (Function0) objB, modifierD, false, ComposableLambdaKt.c(1900948008, true, new b(localThemeScope2, abstractC15962C3, i11, iIntValue, rewardsViewState2), composer2, 54), null, null, color2, color, composer2, 24576, 104);
                composer2 = composer;
                i12 = i13;
                function04 = function0;
                function05 = function02;
                function06 = function03;
                mperksDashBoardActivity2 = mperksDashBoardActivity;
                abstractC15962C2 = abstractC15962C3;
                localThemeScope = localThemeScope2;
                rewardsViewState = rewardsViewState2;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class i {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC6273c.values().length];
            try {
                iArr[EnumC6273c.f60499a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6273c.f60500b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6273c.f60501c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6273c.f60502d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC6273c.f60503e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class j implements InterfaceC14146b, FunctionAdapter {
        j() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, MperksDashBoardActivity.this, MperksDashBoardActivity.class, "handleClaimTabResult", "handleClaimTabResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            MperksDashBoardActivity.this.r3(p02);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$handleTabSelectedState$1", f = "MperksDashBoardActivity.kt", l = {1074}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113755a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Integer> f113757c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(List<Integer> list, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f113757c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MperksDashBoardActivity.this.new k(this.f113757c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f113755a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC15962C abstractC15962C = MperksDashBoardActivity.this.pagerState;
                if (abstractC15962C == null) {
                    Intrinsics.y("pagerState");
                    abstractC15962C = null;
                }
                AbstractC15962C abstractC15962C2 = abstractC15962C;
                int iIndexOf = this.f113757c.indexOf(Boxing.d(j0.f114124F1));
                this.f113755a = 1;
                if (AbstractC15962C.n(abstractC15962C2, iIndexOf, 0.0f, null, this, 6, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$handleTabSelectedState$2", f = "MperksDashBoardActivity.kt", l = {1083}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113758a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Integer> f113760c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(List<Integer> list, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f113760c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MperksDashBoardActivity.this.new l(this.f113760c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f113758a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC15962C abstractC15962C = MperksDashBoardActivity.this.pagerState;
                if (abstractC15962C == null) {
                    Intrinsics.y("pagerState");
                    abstractC15962C = null;
                }
                AbstractC15962C abstractC15962C2 = abstractC15962C;
                int iIndexOf = this.f113760c.indexOf(Boxing.d(j0.f114198d0));
                this.f113758a = 1;
                if (AbstractC15962C.n(abstractC15962C2, iIndexOf, 0.0f, null, this, 6, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$handleTabSelectedState$3", f = "MperksDashBoardActivity.kt", l = {1092}, m = "invokeSuspend")
    static final class m extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113761a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Integer> f113763c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(List<Integer> list, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f113763c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MperksDashBoardActivity.this.new m(this.f113763c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f113761a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC15962C abstractC15962C = MperksDashBoardActivity.this.pagerState;
                if (abstractC15962C == null) {
                    Intrinsics.y("pagerState");
                    abstractC15962C = null;
                }
                AbstractC15962C abstractC15962C2 = abstractC15962C;
                int iIndexOf = this.f113763c.indexOf(Boxing.d(j0.f114119E));
                this.f113761a = 1;
                if (AbstractC15962C.n(abstractC15962C2, iIndexOf, 0.0f, null, this, 6, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<Integer> f113765b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MperksDashBoardActivity f113766a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<Integer> f113767b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$n$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C1803a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AbstractC6023l.a.values().length];
                    try {
                        iArr[AbstractC6023l.a.ON_RESUME.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            a(MperksDashBoardActivity mperksDashBoardActivity, List<Integer> list) {
                this.f113766a = mperksDashBoardActivity;
                this.f113767b = list;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit q(MperksDashBoardActivity mperksDashBoardActivity, List list, InterfaceC6030s interfaceC6030s, AbstractC6023l.a event) {
                Intrinsics.j(interfaceC6030s, "<unused var>");
                Intrinsics.j(event, "event");
                if (C1803a.$EnumSwitchMapping$0[event.ordinal()] == 1) {
                    mperksDashBoardActivity.t3(list);
                }
                return Unit.f142422a;
            }

            public final void e(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                InterfaceC16622O interfaceC16622O;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(110837413, i11, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.onCreate.<anonymous>.<anonymous> (MperksDashBoardActivity.kt:288)");
                }
                this.f113766a.p3().k(165);
                z1 z1VarC = S2.a.c(this.f113766a.o3().u(), null, null, null, composer, 0, 7);
                z1 z1VarC2 = S2.a.c(this.f113766a.o3().v(), null, null, null, composer, 0, 7);
                C17932e0 c17932e0J = C17929d0.j(EnumC17935f0.f167889a, null, composer, 6, 2);
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = new C17963o1();
                    composer.t(objB);
                }
                C17963o1 c17963o1 = (C17963o1) objB;
                composer.P();
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == companion.a()) {
                    objB2 = new C17927c1(c17932e0J, c17963o1);
                    composer.t(objB2);
                }
                C17927c1 c17927c1 = (C17927c1) objB2;
                composer.P();
                final z1 z1VarC3 = S2.a.c(this.f113766a.m3().B(), null, null, null, composer, 0, 7);
                MperksDashBoardActivity mperksDashBoardActivity = this.f113766a;
                int iIndexOf = this.f113767b.indexOf(Integer.valueOf(j0.f114119E));
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f113767b);
                final List<Integer> list = this.f113767b;
                Object objB3 = composer.B();
                if (zD || objB3 == companion.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.mperks.ux.N
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(MperksDashBoardActivity.n.a.p(list));
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                mperksDashBoardActivity.pagerState = C15963D.k(iIndexOf, 0.0f, (Function0) objB3, composer, 0, 2);
                MperksDashBoardActivity mperksDashBoardActivity2 = this.f113766a;
                Object objB4 = composer.B();
                if (objB4 == companion.a()) {
                    objB4 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                    composer.t(objB4);
                }
                mperksDashBoardActivity2.coroutineScope = (InterfaceC16622O) objB4;
                C16395g c16395gP3 = this.f113766a.p3();
                InterfaceC16622O interfaceC16622O2 = this.f113766a.coroutineScope;
                if (interfaceC16622O2 == null) {
                    Intrinsics.y("coroutineScope");
                    interfaceC16622O = null;
                } else {
                    interfaceC16622O = interfaceC16622O2;
                }
                C16381K.b(c16395gP3, c17932e0J, interfaceC16622O, composer, C16395g.f156492l);
                MperksDashBoardActivity mperksDashBoardActivity3 = this.f113766a;
                composer.startReplaceGroup(-1633490746);
                boolean zD2 = composer.D(this.f113766a) | composer.D(this.f113767b);
                final MperksDashBoardActivity mperksDashBoardActivity4 = this.f113766a;
                final List<Integer> list2 = this.f113767b;
                Object objB5 = composer.B();
                if (zD2 || objB5 == companion.a()) {
                    objB5 = new Function2() { // from class: com.meijer.mobile.mperks.ux.O
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MperksDashBoardActivity.n.a.q(mperksDashBoardActivity4, list2, (InterfaceC6030s) obj, (AbstractC6023l.a) obj2);
                        }
                    };
                    composer.t(objB5);
                }
                composer.P();
                mperksDashBoardActivity3.d2((Function2) objB5, composer, 0);
                if (o(z1VarC3).getShouldShowWalkThru()) {
                    composer.startReplaceGroup(-870930652);
                    composer.startReplaceGroup(5004770);
                    boolean zD3 = composer.D(this.f113766a);
                    final MperksDashBoardActivity mperksDashBoardActivity5 = this.f113766a;
                    Object objB6 = composer.B();
                    if (zD3 || objB6 == companion.a()) {
                        objB6 = new Function0() { // from class: com.meijer.mobile.mperks.ux.P
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MperksDashBoardActivity.n.a.k(mperksDashBoardActivity5);
                            }
                        };
                        composer.t(objB6);
                    }
                    Function0 function0 = (Function0) objB6;
                    composer.P();
                    composer.startReplaceGroup(-1633490746);
                    boolean zV = composer.V(z1VarC3) | composer.D(this.f113766a);
                    final MperksDashBoardActivity mperksDashBoardActivity6 = this.f113766a;
                    Object objB7 = composer.B();
                    if (zV || objB7 == companion.a()) {
                        objB7 = new Function1() { // from class: com.meijer.mobile.mperks.ux.Q
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MperksDashBoardActivity.n.a.l(mperksDashBoardActivity6, z1VarC3, ((Integer) obj).intValue());
                            }
                        };
                        composer.t(objB7);
                    }
                    composer.P();
                    ns.q.l(AdsTheme, null, function0, (Function1) objB7, composer, LocalThemeScope.f15770g | (i11 & 14), 1);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-870151715);
                    this.f113766a.S1(AdsTheme, c17927c1, f(z1VarC), g(z1VarC2), o(z1VarC3), this.f113767b, null, composer, LocalThemeScope.f15770g | 48 | (i11 & 14) | (HeaderDecorator.f156340i << 6) | (DrawerLayoutDecorator.f156604h << 9), 32);
                    composer.P();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                e(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            private static final HeaderDecorator f(z1<HeaderDecorator> z1Var) {
                return z1Var.getValue();
            }

            private static final DrawerLayoutDecorator g(z1<DrawerLayoutDecorator> z1Var) {
                return z1Var.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(MperksDashBoardActivity mperksDashBoardActivity) {
                mperksDashBoardActivity.m3().D(new V.a.SeeWhatsNewAction(false));
                mperksDashBoardActivity.p1().w(true);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(MperksDashBoardActivity mperksDashBoardActivity, z1 z1Var, int i10) {
                if (o(z1Var).getIsPointsBalanceUpdated()) {
                    String pointsBalance = o(z1Var).getPointsBalance();
                    String string = mperksDashBoardActivity.getString(i10);
                    Intrinsics.i(string, "getString(...)");
                    mperksDashBoardActivity.T3(pointsBalance, string);
                }
                return Unit.f142422a;
            }

            private static final V.PointsBalanceViewState o(z1<V.PointsBalanceViewState> z1Var) {
                return z1Var.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int p(List list) {
                return list.size();
            }
        }

        n(List<Integer> list) {
            this.f113765b = list;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1833939348, i10, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.onCreate.<anonymous> (MperksDashBoardActivity.kt:287)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(110837413, true, new a(MperksDashBoardActivity.this, this.f113765b), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$onCreate$2", f = "MperksDashBoardActivity.kt", l = {347}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113768a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$onCreate$2$1", f = "MperksDashBoardActivity.kt", l = {348}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f113770a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MperksDashBoardActivity f113771b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MperksDashBoardActivity mperksDashBoardActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f113771b = mperksDashBoardActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f113771b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$b;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/mperks/ux/V$b;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$onCreate$2$1$1", f = "MperksDashBoardActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$o$a$a, reason: collision with other inner class name */
            static final class C1804a extends SuspendLambda implements Function2<V.b, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f113772a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f113773b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ MperksDashBoardActivity f113774c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1804a(MperksDashBoardActivity mperksDashBoardActivity, Continuation<? super C1804a> continuation) {
                    super(2, continuation);
                    this.f113774c = mperksDashBoardActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1804a c1804a = new C1804a(this.f113774c, continuation);
                    c1804a.f113773b = obj;
                    return c1804a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(V.b bVar, Continuation<? super Unit> continuation) {
                    return ((C1804a) create(bVar, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f113772a == 0) {
                        ResultKt.b(obj);
                        this.f113774c.s3((V.b) this.f113773b);
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f113770a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17144F<V.b> events = this.f113771b.m3().getEvents();
                    C1804a c1804a = new C1804a(this.f113771b, null);
                    this.f113770a = 1;
                    if (C17154h.k(events, c1804a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MperksDashBoardActivity.this.new o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f113768a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                MperksDashBoardActivity mperksDashBoardActivity = MperksDashBoardActivity.this;
                AbstractC6023l.b bVar = AbstractC6023l.b.f55277c;
                a aVar = new a(mperksDashBoardActivity, null);
                this.f113768a = 1;
                if (C5994J.b(mperksDashBoardActivity, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$onEvent$1", f = "MperksDashBoardActivity.kt", l = {1109, 1109}, m = "invokeSuspend")
    static final class p extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113775a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f113776b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MperksDashBoardActivity f113777c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC15202c f113778d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new p(this.f113776b, this.f113777c, this.f113778d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(LocalThemeScope localThemeScope, MperksDashBoardActivity mperksDashBoardActivity, AbstractC15202c abstractC15202c, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f113776b = localThemeScope;
            this.f113777c = mperksDashBoardActivity;
            this.f113778d = abstractC15202c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
        
            if (Gi.i.i((Gi.i) r0, r2, null, r3, false, r5, null, null, null, r13, 226, null) == r12) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r13.f113775a
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L1f
                if (r0 == r2) goto L1a
                if (r0 != r1) goto L12
                kotlin.ResultKt.b(r14)
                goto L5b
            L12:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1a:
                kotlin.ResultKt.b(r14)
                r0 = r14
                goto L2f
            L1f:
                kotlin.ResultKt.b(r14)
                Ji.M r0 = r13.f113776b
                r13.f113775a = r2
                r3 = 0
                r4 = 0
                java.lang.Object r0 = Ji.LocalThemeScope.g(r0, r3, r13, r2, r4)
                if (r0 != r12) goto L2f
                goto L5a
            L2f:
                Gi.i r0 = (Gi.i) r0
                com.meijer.mobile.mperks.ux.MperksDashBoardActivity r2 = r13.f113777c
                ko.c r3 = r13.f113778d
                ko.c$d r3 = (ko.AbstractC15202c.ShowErrorToast) r3
                int r3 = r3.getMessageResId()
                java.lang.String r2 = r2.getString(r3)
                java.lang.String r3 = "getString(...)"
                kotlin.jvm.internal.Intrinsics.i(r2, r3)
                Gi.e r3 = Gi.e.f11482b
                ji.q1$m$a$b r5 = ji.q1.m.a.b.f140113a
                r13.f113775a = r1
                r1 = r2
                r2 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 226(0xe2, float:3.17E-43)
                r11 = 0
                r9 = r13
                java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L5b
            L5a:
                return r12
            L5b:
                kotlin.Unit r0 = kotlin.Unit.f142422a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.MperksDashBoardActivity.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$onEvent$2", f = "MperksDashBoardActivity.kt", l = {1124, 1124}, m = "invokeSuspend")
    static final class q extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113779a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f113780b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MperksDashBoardActivity f113781c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new q(this.f113780b, this.f113781c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(LocalThemeScope localThemeScope, MperksDashBoardActivity mperksDashBoardActivity, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f113780b = localThemeScope;
            this.f113781c = mperksDashBoardActivity;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (Gi.i.i((Gi.i) r0, r2, null, r3, false, r5, null, null, null, r13, 224, null) == r12) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r13.f113779a
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L1f
                if (r0 == r2) goto L1a
                if (r0 != r1) goto L12
                kotlin.ResultKt.b(r14)
                goto L55
            L12:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1a:
                kotlin.ResultKt.b(r14)
                r0 = r14
                goto L2f
            L1f:
                kotlin.ResultKt.b(r14)
                Ji.M r0 = r13.f113780b
                r13.f113779a = r2
                r3 = 0
                r4 = 0
                java.lang.Object r0 = Ji.LocalThemeScope.g(r0, r3, r13, r2, r4)
                if (r0 != r12) goto L2f
                goto L54
            L2f:
                Gi.i r0 = (Gi.i) r0
                com.meijer.mobile.mperks.ux.MperksDashBoardActivity r2 = r13.f113781c
                int r3 = com.meijer.mobile.mperks.ux.j0.f114115C1
                java.lang.String r2 = r2.getString(r3)
                java.lang.String r3 = "getString(...)"
                kotlin.jvm.internal.Intrinsics.i(r2, r3)
                Gi.e r3 = Gi.e.f11482b
                ji.q1$m$a$d r5 = ji.q1.m.a.d.f140117a
                r13.f113779a = r1
                r1 = r2
                r2 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 224(0xe0, float:3.14E-43)
                r11 = 0
                r9 = r13
                java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L55
            L54:
                return r12
            L55:
                kotlin.Unit r0 = kotlin.Unit.f142422a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.MperksDashBoardActivity.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$onNavigationRequest$1", f = "MperksDashBoardActivity.kt", l = {androidx.room.G.MAX_BIND_PARAMETER_CNT}, m = "invokeSuspend")
    static final class r extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113782a;

        r(Continuation<? super r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MperksDashBoardActivity.this.new r(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f113782a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC15962C abstractC15962C = MperksDashBoardActivity.this.pagerState;
                if (abstractC15962C == null) {
                    Intrinsics.y("pagerState");
                    abstractC15962C = null;
                }
                this.f113782a = 1;
                if (AbstractC15962C.d0(abstractC15962C, 1, 0.0f, this, 2, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$onNavigationRequest$2", f = "MperksDashBoardActivity.kt", l = {1006}, m = "invokeSuspend")
    static final class s extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113784a;

        s(Continuation<? super s> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MperksDashBoardActivity.this.new s(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f113784a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC15962C abstractC15962C = MperksDashBoardActivity.this.pagerState;
                if (abstractC15962C == null) {
                    Intrinsics.y("pagerState");
                    abstractC15962C = null;
                }
                this.f113784a = 1;
                if (AbstractC15962C.d0(abstractC15962C, 2, 0.0f, this, 2, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class t extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113786f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentActivity componentActivity) {
            super(0);
            this.f113786f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f113786f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class u extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113787f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentActivity componentActivity) {
            super(0);
            this.f113787f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f113787f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class v extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f113788f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113789g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f113788f = function0;
            this.f113789g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f113788f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f113789g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class w extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113790f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentActivity componentActivity) {
            super(0);
            this.f113790f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f113790f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class x extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113791f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ComponentActivity componentActivity) {
            super(0);
            this.f113791f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f113791f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class y extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f113792f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113793g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f113792f = function0;
            this.f113793g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f113792f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f113793g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class z extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113794f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ComponentActivity componentActivity) {
            super(0);
            this.f113794f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f113794f.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b2(final Ji.LocalThemeScope r34, final kotlin.AbstractC15962C r35, final java.util.List<java.lang.Integer> r36, final int r37, final boolean r38, final qo.RewardsViewState r39, final ko.ClaimTabState r40, final int r41, final bo.EnumC6273c r42, androidx.compose.ui.Modifier r43, final kotlin.jvm.functions.Function1<? super bo.EnumC6273c, kotlin.Unit> r44, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r45, final oo.EarnInProgressState r46, final kotlin.jvm.functions.Function0<kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.MperksDashBoardActivity.b2(Ji.M, o0.C, java.util.List, int, boolean, qo.M, ko.d, int, bo.c, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, oo.v, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g2(MperksDashBoardActivity mperksDashBoardActivity, Function2 function2, int i10, Composer composer, int i11) {
        mperksDashBoardActivity.d2(function2, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:343:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h2(final Ji.LocalThemeScope r45, final int r46, final java.util.List<java.lang.Integer> r47, final boolean r48, final kotlin.AbstractC15962C r49, final ko.ClaimTabState r50, final qo.RewardsViewState r51, final oo.EarnInProgressState r52, final com.meijer.mobile.mperks.ux.V.PointsBalanceViewState r53, final boolean r54, final boolean r55, androidx.compose.ui.Modifier r56, final kotlin.jvm.functions.Function0<kotlin.Unit> r57, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r58, final kotlin.jvm.functions.Function0<kotlin.Unit> r59, kotlin.jvm.functions.Function0<kotlin.Unit> r60, kotlin.jvm.functions.Function0<kotlin.Unit> r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r63, androidx.compose.runtime.Composer r64, final int r65, final int r66, final int r67) {
        /*
            Method dump skipped, instructions count: 1814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.MperksDashBoardActivity.h2(Ji.M, int, java.util.List, boolean, o0.C, ko.d, qo.M, oo.v, com.meijer.mobile.mperks.ux.V$c, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C3(LocalThemeScope localThemeScope, AbstractC15202c abstractC15202c, InterfaceC16622O interfaceC16622O) {
        if (abstractC15202c instanceof AbstractC15202c.ShowErrorToast) {
            C16648k.d(interfaceC16622O, null, null, new p(localThemeScope, this, abstractC15202c, null), 3, null);
            return;
        }
        if (abstractC15202c instanceof AbstractC15202c.b) {
            setResult(HomeFragment.MPERKS_REWARDS_UPDATED_RESULT_CODE);
            return;
        }
        if (abstractC15202c instanceof AbstractC15202c.ShowClaimSuccessToast) {
            C16648k.d(interfaceC16622O, null, null, new q(localThemeScope, this, null), 3, null);
            Q3(((AbstractC15202c.ShowClaimSuccessToast) abstractC15202c).getCoupon());
        } else {
            if (!(abstractC15202c instanceof AbstractC15202c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            m3().D(V.a.g.f113826a);
            m3().D(V.a.h.f113827a);
            q3().s(AbstractC16581o.c.f157441a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D3(bo.g navigationRequest) {
        InterfaceC16622O interfaceC16622O;
        InterfaceC16622O interfaceC16622O2;
        if (navigationRequest instanceof g.i) {
            this.isEarnTabAnalyticsSent = false;
            InterfaceC16622O interfaceC16622O3 = this.coroutineScope;
            if (interfaceC16622O3 == null) {
                Intrinsics.y("coroutineScope");
                interfaceC16622O2 = null;
            } else {
                interfaceC16622O2 = interfaceC16622O3;
            }
            C16648k.d(interfaceC16622O2, null, null, new r(null), 3, null);
            return;
        }
        if (navigationRequest instanceof g.h) {
            this.isClaimTabAnalyticsSent = false;
            InterfaceC16622O interfaceC16622O4 = this.coroutineScope;
            if (interfaceC16622O4 == null) {
                Intrinsics.y("coroutineScope");
                interfaceC16622O = null;
            } else {
                interfaceC16622O = interfaceC16622O4;
            }
            C16648k.d(interfaceC16622O, null, null, new s(null), 3, null);
            return;
        }
        if (navigationRequest instanceof g.OnClippedRewardCardClicked) {
            E3(((g.OnClippedRewardCardClicked) navigationRequest).getClippedReward());
            return;
        }
        if (navigationRequest instanceof g.OnViewAllRewardsClicked) {
            m3().D(new V.a.ViewAllRewardsClicked(((g.OnViewAllRewardsClicked) navigationRequest).a()));
            return;
        }
        if (navigationRequest instanceof g.CreditCardViewClickedOnInProgressPill) {
            m3().D(new V.a.CreditCardViewClickedOnInProgressPill(((g.CreditCardViewClickedOnInProgressPill) navigationRequest).getMccProgram()));
            return;
        }
        if (navigationRequest instanceof g.a) {
            m3().D(V.a.b.f113821a);
            return;
        }
        if (navigationRequest instanceof g.OnClaimRewardCardClicked) {
            A3(((g.OnClaimRewardCardClicked) navigationRequest).getClaimReward());
            return;
        }
        if (navigationRequest instanceof g.OnAutoClaimRewardCardClicked) {
            l3().D();
            m3().D(new V.a.AutoEnrollDescriptionClicked(((g.OnAutoClaimRewardCardClicked) navigationRequest).getAutoClaimReward()));
        } else if (navigationRequest instanceof g.m) {
            m3().D(V.a.j.f113829a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H3(AutoClaimReward autoClaimReward, MperksDashBoardActivity mperksDashBoardActivity, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Claim");
        track.h("rewardID", autoClaimReward.getTitle());
        track.h("autoClaimType", autoClaimReward.getAutoClaimType());
        track.h("autoClaimAmount", String.valueOf(autoClaimReward.getAutoClaimAmount()));
        track.h("mperksPoints", String.valueOf(mperksDashBoardActivity.mperksPointBalance));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J3(AutoClaimReward autoClaimReward, String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Claim");
        track.h("rewardID", autoClaimReward.getTitle());
        track.h("mperksPoints", str);
        track.h("autoClaimType", autoClaimReward.getAutoClaimType());
        track.h("autoClaimAmount", String.valueOf(autoClaimReward.getAutoClaimAmount()));
        return Unit.f142422a;
    }

    private final void K3(EnumC6273c selectedClaimSubPill, final int pointBalance) {
        String str;
        int i10 = i.$EnumSwitchMapping$0[selectedClaimSubPill.ordinal()];
        if (i10 == 1) {
            str = "mPerks:Claim Page:All Pill";
        } else if (i10 == 2) {
            str = "mPerks:Claim Page:Free Items Pill";
        } else if (i10 == 3) {
            str = "mPerks:Claim Page:Fuel Pill";
        } else if (i10 == 4) {
            str = "mPerks:Claim Page:Total Purchase Pill";
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = "mPerks:Claim Page:Auto Claim Pill";
        }
        o1().h(C14476c.a(str), new Function1() { // from class: com.meijer.mobile.mperks.ux.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MperksDashBoardActivity.L3(pointBalance, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L3(int i10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Claim");
        track.h("mperksPoints", String.valueOf(i10));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M3(int pointBalance, List<String> claimRewards) {
        if (this.isClaimTabAnalyticsSent) {
            return;
        }
        this.previousTrackAction = u3() ? "Learn More: Redeem Rewards" : "Claim Tab";
        l3().E(new AbstractC15200a.TrackClaimTabSelected(pointBalance, claimRewards, this.previousTrackAction));
        this.isClaimTabAnalyticsSent = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O3(String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.h("mperksPoints", str);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P3(int pointsBalance, String rewardsInProgressList, String rewardsAvailableList, bo.e tab) {
        if (this.isEarnTabAnalyticsSent) {
            return;
        }
        this.previousTrackAction = u3() ? "Learn More: Start Earning" : "Earn Tab";
        n3().w(new e0.TrackEarnPillsSelected(pointsBalance, tab, rewardsAvailableList, rewardsInProgressList, this.previousTrackAction));
        this.previousTrackAction = "Earn Tab";
        this.isEarnTabAnalyticsSent = true;
    }

    private final void Q3(ClaimReward claimReward) {
        String str;
        String strG;
        int pointCost = claimReward != null ? claimReward.getPointCost() : 0;
        ko.z zVarL3 = l3();
        if (claimReward != null) {
            str = claimReward.getCouponId() + ": " + claimReward.getName();
        } else {
            str = null;
        }
        if (claimReward == null || (strG = claimReward.g()) == null) {
            strG = "No Validity";
        }
        zVarL3.E(new AbstractC15200a.TrackRewardClaimedAction(str, strG, String.valueOf(claimReward != null ? Long.valueOf(claimReward.d()) : null), "mPerks Claim page", pointCost, this.mperksPointBalance - pointCost));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S1(final Ji.LocalThemeScope r34, final kotlin.C17927c1 r35, final ps.HeaderDecorator r36, final ps.DrawerLayoutDecorator r37, final com.meijer.mobile.mperks.ux.V.PointsBalanceViewState r38, final java.util.List<java.lang.Integer> r39, androidx.compose.ui.Modifier r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.MperksDashBoardActivity.S1(Ji.M, x0.c1, ps.F, ps.t, com.meijer.mobile.mperks.ux.V$c, java.util.List, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S3(String str, String str2, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Earn");
        track.n("mPerks:Reward Details Page");
        track.h("mperksPoints", str);
        track.h("rewardID", str2);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U3(String str, MperksDashBoardActivity mperksDashBoardActivity, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Walkthrough");
        track.h("mperksPoints", str);
        if (mperksDashBoardActivity.isWalkThruTriggered) {
            track.p(mperksDashBoardActivity.getString(j0.f114148N1));
            mperksDashBoardActivity.isWalkThruTriggered = false;
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V1(MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope, C17927c1 c17927c1, HeaderDecorator headerDecorator, DrawerLayoutDecorator drawerLayoutDecorator, V.PointsBalanceViewState pointsBalanceViewState, List list, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        mperksDashBoardActivity.S1(localThemeScope, c17927c1, headerDecorator, drawerLayoutDecorator, pointsBalanceViewState, list, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c2(MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope, AbstractC15962C abstractC15962C, List list, int i10, boolean z10, RewardsViewState rewardsViewState, ClaimTabState claimTabState, int i11, EnumC6273c enumC6273c, Modifier modifier, Function1 function1, Function1 function12, EarnInProgressState earnInProgressState, Function0 function0, int i12, int i13, int i14, Composer composer, int i15) {
        mperksDashBoardActivity.b2(localThemeScope, abstractC15962C, list, i10, z10, rewardsViewState, claimTabState, i11, enumC6273c, modifier, function1, function12, earnInProgressState, function0, composer, J0.a(i12 | 1), J0.a(i13), i14);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.E e2(z1 z1Var, final z1 z1Var2, androidx.compose.runtime.F DisposableEffect) {
        Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
        AbstractC6023l lifecycle = ((InterfaceC6030s) z1Var.getValue()).getLifecycle();
        InterfaceC6027p interfaceC6027p = new InterfaceC6027p() { // from class: com.meijer.mobile.mperks.ux.r
            @Override // androidx.view.InterfaceC6027p
            public final void onStateChanged(InterfaceC6030s interfaceC6030s, AbstractC6023l.a aVar) {
                MperksDashBoardActivity.f2(z1Var2, interfaceC6030s, aVar);
            }
        };
        lifecycle.a(interfaceC6027p);
        return new C12656e(lifecycle, interfaceC6027p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f2(z1 z1Var, InterfaceC6030s owner, AbstractC6023l.a event) {
        Intrinsics.j(owner, "owner");
        Intrinsics.j(event, "event");
        ((Function2) z1Var.getValue()).invoke(owner, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i2() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j2() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k2() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l2(float f10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ko.z l3() {
        return (ko.z) this.claimTabViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V m3() {
        return (V) this.dashBoardViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oo.a0 n3() {
        return (oo.a0) this.earnTabViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16382L o3() {
        return (C16382L) this.navigationDrawerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16395g p3() {
        return (C16395g) this.navigationHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16558I q3() {
        return (C16558I) this.rewardsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s2(MperksDashBoardActivity mperksDashBoardActivity, InterfaceC5730l0 interfaceC5730l0, EnumC6273c pill) {
        Intrinsics.j(pill, "pill");
        r2(interfaceC5730l0, pill);
        mperksDashBoardActivity.K3(q2(interfaceC5730l0), mperksDashBoardActivity.mperksPointBalance);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s3(V.b event) {
        if (event instanceof V.b.h) {
            startActivity(Al.d.a(this, true, this.mperksPointBalance));
            return;
        }
        if (event instanceof V.b.c) {
            startActivity(new Intent(this, (Class<?>) LearnToEarnActivity.class));
            return;
        }
        if (event instanceof V.b.i) {
            startActivity(new Intent(this, (Class<?>) TransactionHistoryActivity.class));
            return;
        }
        if (event instanceof V.b.a) {
            startActivity(f0.f114022a.d(this));
            return;
        }
        if (event instanceof V.b.CreditCardViewInProgress) {
            startActivity(f0.f114022a.c(this, ((V.b.CreditCardViewInProgress) event).getMccProgram()));
            return;
        }
        if (event instanceof V.b.NavigateToAutoEnrollInfoPage) {
            V.b.NavigateToAutoEnrollInfoPage navigateToAutoEnrollInfoPage = (V.b.NavigateToAutoEnrollInfoPage) event;
            this.autoClaimDetailActivityLauncher.a(f0.f114022a.a(this, navigateToAutoEnrollInfoPage.getAutoClaimReward()));
            I3(String.valueOf(this.mperksPointBalance), navigateToAutoEnrollInfoPage.getAutoClaimReward());
        } else if (event instanceof V.b.NavigateToDescriptionPage) {
            V.b.NavigateToDescriptionPage navigateToDescriptionPage = (V.b.NavigateToDescriptionPage) event;
            startActivity(f0.f114022a.e(this, navigateToDescriptionPage.getCoupon(), navigateToDescriptionPage.getNavigatedFrom(), navigateToDescriptionPage.getIsShoppableReward()));
        } else if (event instanceof V.b.NavigateToViewAllRewards) {
            startActivity(f0.f114022a.f(this, ((V.b.NavigateToViewAllRewards) event).a(), String.valueOf(this.mperksPointBalance)));
        } else {
            if (!(event instanceof V.b.e)) {
                throw new NoWhenBranchMatchedException();
            }
            startActivity(r1().d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u2(MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope, int i10, List list, boolean z10, AbstractC15962C abstractC15962C, ClaimTabState claimTabState, RewardsViewState rewardsViewState, EarnInProgressState earnInProgressState, V.PointsBalanceViewState pointsBalanceViewState, boolean z11, boolean z12, Modifier modifier, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function12, int i11, int i12, int i13, Composer composer, int i14) {
        mperksDashBoardActivity.h2(localThemeScope, i10, list, z10, abstractC15962C, claimTabState, rewardsViewState, earnInProgressState, pointsBalanceViewState, z11, z12, modifier, function0, function1, function02, function03, function04, function05, function12, composer, J0.a(i11 | 1), J0.a(i12), i13);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16395g z3(MperksDashBoardActivity mperksDashBoardActivity) {
        return new C16395g(mperksDashBoardActivity);
    }

    public final void d2(final Function2<? super InterfaceC6030s, ? super AbstractC6023l.a, Unit> onEvent, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(onEvent, "onEvent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1183492245);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(onEvent) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1183492245, i11, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.OnLifecycleEvent (MperksDashBoardActivity.kt:976)");
            }
            final z1 z1VarP = o1.p(onEvent, composerStartRestartGroup, i11 & 14);
            final z1 z1VarP2 = o1.p(composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), composerStartRestartGroup, 0);
            Object value = z1VarP2.getValue();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zV = composerStartRestartGroup.V(z1VarP2) | composerStartRestartGroup.V(z1VarP);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.mperks.ux.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MperksDashBoardActivity.e2(z1VarP2, z1VarP, (androidx.compose.runtime.F) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.c(value, (Function1) objB, composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.mperks.ux.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MperksDashBoardActivity.g2(this.f114298a, onEvent, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.j(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        Gi.i.INSTANCE.b();
        super.onPause();
    }

    private final void A3(ClaimReward claimReward) {
        int i10;
        ko.z zVarL3 = l3();
        String str = claimReward.getCouponId() + ": " + claimReward.getName();
        String strG = claimReward.g();
        if (strG == null) {
            strG = getString(j0.f114112B1);
            Intrinsics.i(strG, "getString(...)");
        }
        String strValueOf = String.valueOf(claimReward.d());
        if (ClaimReward.o(claimReward, null, 1, null)) {
            i10 = j0.f114109A1;
        } else {
            i10 = j0.f114277y1;
        }
        String string = getString(i10);
        Intrinsics.i(string, "getString(...)");
        zVarL3.E(new AbstractC15200a.TrackClaimRewardCardClicked(str, strG, strValueOf, string, this.mperksPointBalance));
        m3().D(new V.a.ViewRewardDescriptionClicked(claimReward.r(), "MPERKS_REDEEM_TAB", false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B3(EarnReward earnReward, boolean isBoosterReward, String navigatedFrom, int pointsBalance, boolean isShoppableReward) {
        m3().D(new V.a.ViewRewardDescriptionClicked(earnReward.q(), navigatedFrom, isShoppableReward));
        if (Intrinsics.e(navigatedFrom, "MPERKS_EARN_TAB_IN_PROGRESS")) {
            if (earnReward.getEndAt() != null) {
                n3().w(new e0.TrackInProgressRewardCardClicked(earnReward.getRewardId() + ": " + earnReward.getTitle(), "In Progress", earnReward.getDaysLeft(), earnReward.getDateFormattedForAnalytics(), pointsBalance, isBoosterReward));
                return;
            }
            return;
        }
        if (Intrinsics.e(navigatedFrom, "MPERKS_EARN_TAB_AVAILABLE")) {
            n3().w(new e0.TrackAvailableRewardCardClicked(earnReward.getRewardId() + ": " + earnReward.getTitle(), "Available", earnReward.getDaysLeft(), earnReward.getDateFormattedForAnalytics(), pointsBalance));
        }
    }

    private final void E3(ClippedReward clippedReward) {
        String str;
        m3().D(new V.a.ViewRewardDescriptionClicked(clippedReward.i(), "MPERKS_REWARDS_TAB", false));
        C16558I c16558iQ3 = q3();
        String str2 = clippedReward.getRewardId() + ": " + clippedReward.getName();
        ZonedDateTime endDate = clippedReward.getEndDate();
        if (endDate != null) {
            str = endDate.format(C17590a.DATE_FORMAT_MM_DD_YYYY);
        } else {
            str = null;
        }
        c16558iQ3.s(new AbstractC16581o.AnalyticsRewardDetailsPage(str2, str, String.valueOf(clippedReward.getDaysLeft()), String.valueOf(this.mperksPointBalance), "Learn More: View Rewards"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F3(int pointBalance, List<String> availableRewards) {
        String str;
        if (u3()) {
            str = "Learn More: View Rewards";
        } else {
            str = "Rewards Tab";
        }
        this.previousTrackAction = str;
        q3().s(new AbstractC16581o.AnalyticsRewardsAction(String.valueOf(pointBalance), availableRewards, this.previousTrackAction));
        this.isRewardsTabAnalyticsSent = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G3(String claimAction, final AutoClaimReward autoClaimReward) {
        o1().h(C14476c.a(claimAction), new Function1() { // from class: com.meijer.mobile.mperks.ux.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MperksDashBoardActivity.H3(autoClaimReward, this, (TrackingData) obj);
            }
        });
    }

    private final void I3(final String pointsBalance, final AutoClaimReward autoClaimReward) {
        o1().h(C14476c.h("mPerks:Auto Claim Details Page"), new Function1() { // from class: com.meijer.mobile.mperks.ux.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MperksDashBoardActivity.J3(autoClaimReward, pointsBalance, (TrackingData) obj);
            }
        });
    }

    private final void N3(final String pointsBalance) {
        o1().h(C14476c.a("mPerks:Walkthrough banner removed"), new Function1() { // from class: com.meijer.mobile.mperks.ux.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MperksDashBoardActivity.O3(pointsBalance, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R3(final String rewardId, final String pointsBalance) {
        o1().h(C14476c.a("mPerks Rewards:Shop Now"), new Function1() { // from class: com.meijer.mobile.mperks.ux.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MperksDashBoardActivity.S3(pointsBalance, rewardId, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClaimTabState T1(z1<ClaimTabState> z1Var) {
        return z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T3(final String pointsBalance, String state) {
        o1().h(C14476c.h(state), new Function1() { // from class: com.meijer.mobile.mperks.ux.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MperksDashBoardActivity.U3(pointsBalance, this, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U1(InterfaceC5724i0 interfaceC5724i0, float f10) {
        interfaceC5724i0.B(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float W1(InterfaceC5724i0 interfaceC5724i0) {
        return interfaceC5724i0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X1(InterfaceC5724i0 interfaceC5724i0, float f10) {
        interfaceC5724i0.B(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Y1(InterfaceC5724i0 interfaceC5724i0) {
        return interfaceC5724i0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z1(InterfaceC5724i0 interfaceC5724i0, float f10) {
        interfaceC5724i0.B(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float a2(InterfaceC5724i0 interfaceC5724i0) {
        return interfaceC5724i0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m2(MperksDashBoardActivity mperksDashBoardActivity, Function1 function1) {
        mperksDashBoardActivity.p1().H(false);
        mperksDashBoardActivity.N3(String.valueOf(mperksDashBoardActivity.mperksPointBalance));
        function1.invoke(Boolean.FALSE);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n2(MperksDashBoardActivity mperksDashBoardActivity) {
        mperksDashBoardActivity.m3().D(new V.a.SeeWhatsNewAction(true));
        mperksDashBoardActivity.isWalkThruTriggered = true;
        return Unit.f142422a;
    }

    private static final int o2(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p2(InterfaceC5726j0 interfaceC5726j0, int i10) {
        interfaceC5726j0.j(i10);
    }

    private static final EnumC6273c q2(InterfaceC5730l0<EnumC6273c> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void r2(InterfaceC5730l0<EnumC6273c> interfaceC5730l0, EnumC6273c enumC6273c) {
        interfaceC5730l0.setValue(enumC6273c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r3(C14145a result) {
        if (result.getResultCode() == -1) {
            l3().x();
            m3().D(V.a.g.f113826a);
            m3().D(V.a.h.f113827a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t2(InterfaceC5726j0 interfaceC5726j0, int i10) {
        p2(interfaceC5726j0, i10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t3(List<Integer> tabList) {
        InterfaceC16622O interfaceC16622O;
        InterfaceC16622O interfaceC16622O2;
        InterfaceC16622O interfaceC16622O3;
        if (y3()) {
            InterfaceC16622O interfaceC16622O4 = this.coroutineScope;
            if (interfaceC16622O4 == null) {
                Intrinsics.y("coroutineScope");
                interfaceC16622O3 = null;
            } else {
                interfaceC16622O3 = interfaceC16622O4;
            }
            C16648k.d(interfaceC16622O3, null, null, new k(tabList, null), 3, null);
            if (u3()) {
                this.previousTrackAction = "Learn More: View Rewards";
                this.isRewardsTabAnalyticsSent = false;
                return;
            }
            return;
        }
        if (x3()) {
            InterfaceC16622O interfaceC16622O5 = this.coroutineScope;
            if (interfaceC16622O5 == null) {
                Intrinsics.y("coroutineScope");
                interfaceC16622O2 = null;
            } else {
                interfaceC16622O2 = interfaceC16622O5;
            }
            C16648k.d(interfaceC16622O2, null, null, new l(tabList, null), 3, null);
            if (u3()) {
                this.previousTrackAction = "Learn More: Start Earning";
                this.isEarnTabAnalyticsSent = false;
                return;
            }
            return;
        }
        if (w3()) {
            InterfaceC16622O interfaceC16622O6 = this.coroutineScope;
            if (interfaceC16622O6 == null) {
                Intrinsics.y("coroutineScope");
                interfaceC16622O = null;
            } else {
                interfaceC16622O = interfaceC16622O6;
            }
            C16648k.d(interfaceC16622O, null, null, new m(tabList, null), 3, null);
            if (u3()) {
                this.previousTrackAction = "Learn More: Redeem Rewards";
                this.isClaimTabAnalyticsSent = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u3() {
        return getIntent().getBooleanExtra("com.meijer.mobile.mperks.EXTRA_IS_LEARN_TO_EARN", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v3() {
        return getIntent().getBooleanExtra("com.meijer.mobile.mperks.EXTRA_IS_FROM_EARN_REWARDS_AVAILABLE_PILL", false);
    }

    private final boolean w3() {
        return getIntent().getBooleanExtra("com.meijer.mobile.mperks.EXTRA_IS_FROM_CLAIM_REWARDS", false);
    }

    private final boolean x3() {
        return getIntent().getBooleanExtra("com.meijer.mobile.mperks.EXTRA_IS_FROM_EARN_REWARDS", false);
    }

    private final boolean y3() {
        return getIntent().getBooleanExtra("com.meijer.mobile.mperks.EXTRA_IS_FROM_VIEW_REWARDS", false);
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        List listP;
        super.onCreate(savedInstanceState);
        getLifecycle().a(m3());
        m3().D(V.a.g.f113826a);
        m3().D(V.a.f.f113825a);
        m3().D(V.a.h.f113827a);
        if (s1().e(AbstractC18227f.C.f170544h)) {
            n3().w(e0.a.f154637a);
        }
        this.earnTabIndex = v3() ? 1 : 0;
        o3().w(165);
        if (s1().e(AbstractC18227f.I.f170548h)) {
            listP = CollectionsKt.p(Integer.valueOf(j0.f114119E), Integer.valueOf(j0.f114198d0));
        } else {
            listP = CollectionsKt.p(Integer.valueOf(j0.f114124F1), Integer.valueOf(j0.f114198d0), Integer.valueOf(j0.f114119E));
        }
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1833939348, true, new n(listP)), 1, null);
        C16648k.d(C6031t.a(this), null, null, new o(null), 3, null);
    }

    @Override // com.meijer.mobile.mperks.ux.MperksFeatureActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.fsPage.start();
    }
}
