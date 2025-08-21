package com.meijer.mobile.mperks.ux;

import Ki.C;
import Ki.LocalThemeScope;
import V2.CreationExtras;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5866i0;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.AbstractC6165l;
import androidx.view.C6136J;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.InterfaceC6169p;
import androidx.view.InterfaceC6172s;
import androidx.view.f0;
import bk.AbstractC6392a;
import co.AbstractC6536h;
import co.AbstractC6537i;
import co.AutoClaimReward;
import co.ClaimReward;
import co.ClippedReward;
import co.EarnReward;
import co.EnumC6532d;
import co.EnumC6534f;
import com.fullstory.FS;
import com.fullstory.FSPage;
import com.meijer.mobile.meijer.activity.home.HomeFragment;
import com.meijer.mobile.mperks.ux.MperksDashBoardActivity;
import com.meijer.mobile.mperks.ux.V;
import com.meijer.mobile.mperks.ux.learnToEarn.LearnToEarnActivity;
import com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryActivity;
import e.C13737e;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import ii.C14756c;
import ii.TrackingData;
import j$.time.ZonedDateTime;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.q1;
import ko.AbstractC15303a;
import ko.AbstractC15305c;
import ko.ClaimTabState;
import kotlin.A1;
import kotlin.AbstractC16037C;
import kotlin.C15544D;
import kotlin.C16038D;
import kotlin.C17959M0;
import kotlin.C17987a1;
import kotlin.C17993c1;
import kotlin.C17995d0;
import kotlin.C17998e0;
import kotlin.C18029o1;
import kotlin.EnumC18001f0;
import kotlin.Function;
import kotlin.InterfaceC16060u;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import no.MccEnrollmentState;
import no.PointsExpState;
import oo.EarnAvailableViewState;
import oo.EarnInProgressState;
import oo.e0;
import org.xmlpull.v1.XmlPullParserException;
import p1.C16338g;
import ps.AbstractC16499C;
import ps.C16498B;
import ps.C16507K;
import ps.C16508L;
import ps.C16521g;
import ps.DrawerLayoutDecorator;
import ps.HeaderDecorator;
import pv.C16563h;
import pv.InterfaceC16553F;
import pv.InterfaceC16561f;
import qo.AbstractC16740o;
import qo.C16710B;
import qo.C16717I;
import qo.RewardsViewState;
import wk.C17898a;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000º\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 Ó\u00012\u00020\u0001:\u0002Ô\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJG\u0010\u0016\u001a\u00020\u000626\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00060\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0018\u0010\u0003JK\u0010'\u001a\u00020\u0006*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\b\u0002\u0010&\u001a\u00020%H\u0003¢\u0006\u0004\b'\u0010(Jé\u0001\u0010A\u001a\u00020\u0006*\u00020\u00192\u0006\u0010)\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020*2\b\b\u0002\u0010&\u001a\u00020%2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u0006072\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0006092\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0006072\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0006072\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0006072\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0006072\u0014\b\u0002\u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000609H\u0003¢\u0006\u0004\bA\u0010BJ¡\u0001\u0010H\u001a\u00020\u0006*\u00020\u00192\u0006\u0010-\u001a\u00020,2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010)\u001a\u00020#2\u0006\u0010C\u001a\u00020*2\u0006\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.2\u0006\u0010D\u001a\u00020#2\u0006\u0010F\u001a\u00020E2\b\b\u0002\u0010&\u001a\u00020%2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u0006092\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0006092\u0006\u00103\u001a\u0002022\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000607H\u0003¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\u00062\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u00062\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJ\u001d\u0010R\u001a\u00020\u00062\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\bR\u0010SJ#\u0010W\u001a\u00020\u0006*\u00020\u00192\u0006\u0010\u0014\u001a\u00020T2\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bW\u0010XJ%\u0010\\\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020#2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\"H\u0002¢\u0006\u0004\b\\\u0010]J/\u0010b\u001a\u00020\u00062\u0006\u0010)\u001a\u00020#2\u0006\u0010^\u001a\u00020Z2\u0006\u0010_\u001a\u00020Z2\u0006\u0010a\u001a\u00020`H\u0002¢\u0006\u0004\bb\u0010cJ%\u0010e\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020#2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020Z0\"H\u0002¢\u0006\u0004\be\u0010]J7\u0010k\u001a\u00020\u00062\u0006\u0010g\u001a\u00020f2\u0006\u0010h\u001a\u00020*2\u0006\u0010i\u001a\u00020Z2\u0006\u0010)\u001a\u00020#2\u0006\u0010j\u001a\u00020*H\u0002¢\u0006\u0004\bk\u0010lJ\u001f\u0010n\u001a\u00020\u00062\u0006\u0010m\u001a\u00020Z2\u0006\u0010)\u001a\u00020ZH\u0002¢\u0006\u0004\bn\u0010oJ\u0017\u0010r\u001a\u00020\u00062\u0006\u0010q\u001a\u00020pH\u0002¢\u0006\u0004\br\u0010sJ\u0017\u0010v\u001a\u00020\u00062\u0006\u0010u\u001a\u00020tH\u0002¢\u0006\u0004\bv\u0010wJ\u0019\u0010x\u001a\u00020\u00062\b\u0010u\u001a\u0004\u0018\u00010tH\u0002¢\u0006\u0004\bx\u0010wJ\u001f\u0010|\u001a\u00020\u00062\u0006\u0010y\u001a\u00020Z2\u0006\u0010{\u001a\u00020zH\u0002¢\u0006\u0004\b|\u0010}J \u0010\u007f\u001a\u00020\u00062\u0006\u0010~\u001a\u00020E2\u0006\u0010Y\u001a\u00020#H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001b\u0010\u0082\u0001\u001a\u00020\u00062\u0007\u0010\u0014\u001a\u00030\u0081\u0001H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J!\u0010\u0084\u0001\u001a\u00020\u00062\u0006\u0010)\u001a\u00020Z2\u0006\u0010{\u001a\u00020zH\u0002¢\u0006\u0005\b\u0084\u0001\u0010}J\"\u0010\u0086\u0001\u001a\u00020\u00062\u0006\u0010)\u001a\u00020Z2\u0007\u0010\u0085\u0001\u001a\u00020ZH\u0002¢\u0006\u0005\b\u0086\u0001\u0010oJ\u001a\u0010\u0087\u0001\u001a\u00020\u00062\u0006\u0010)\u001a\u00020ZH\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001R!\u0010\u008e\u0001\u001a\u00030\u0089\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R!\u0010\u0093\u0001\u001a\u00030\u008f\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u008b\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R!\u0010\u0098\u0001\u001a\u00030\u0094\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u008b\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R!\u0010\u009d\u0001\u001a\u00030\u0099\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u008b\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010V\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0019\u0010¤\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R!\u0010©\u0001\u001a\u00030¥\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¦\u0001\u0010\u008b\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R!\u0010®\u0001\u001a\u00030ª\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0001\u0010\u008b\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001b\u0010±\u0001\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0019\u0010³\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010 \u0001R\u0019\u0010µ\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010£\u0001R\u0019\u0010·\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010£\u0001R\u0019\u0010¹\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010£\u0001R\u0018\u0010D\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010 \u0001R\u0019\u0010¼\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010£\u0001R\u001e\u0010À\u0001\u001a\t\u0012\u0004\u0012\u00020\n0½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\"\u0010Å\u0001\u001a\r Â\u0001*\u0005\u0018\u00010Á\u00010Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u001d\u0010È\u0001\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0017\u0010Ë\u0001\u001a\u00020*8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0017\u0010Í\u0001\u001a\u00020*8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010Ê\u0001R\u0017\u0010Ï\u0001\u001a\u00020*8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ê\u0001R\u0016\u0010+\u001a\u00020*8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ê\u0001R\u0017\u0010Ò\u0001\u001a\u00020*8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ê\u0001¨\u0006Û\u0001²\u0006\f\u0010\u001d\u001a\u00020\u001c8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001f\u001a\u00020\u001e8\nX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002²\u0006\f\u0010/\u001a\u00020.8\nX\u008a\u0084\u0002²\u0006\u000f\u0010Õ\u0001\u001a\u00020?8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010Ö\u0001\u001a\u00020?8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010×\u0001\u001a\u00020?8\n@\nX\u008a\u008e\u0002²\u0006\f\u00103\u001a\u0002028\nX\u008a\u0084\u0002²\u0006\f\u00101\u001a\u0002008\nX\u008a\u0084\u0002²\u0006\u000e\u00105\u001a\u00020*8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010Ø\u0001\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010F\u001a\u00020E8\n@\nX\u008a\u008e\u0002²\u0006\u0011\u0010Ù\u0001\u001a\u0004\u0018\u00010Z8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010Ú\u0001\u001a\u00020*8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/meijer/mobile/mperks/ux/MperksDashBoardActivity;", "Lcom/meijer/mobile/mperks/ux/MperksFeatureActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Lkotlin/Function2;", "Landroidx/lifecycle/s;", "Lkotlin/ParameterName;", "name", "owner", "Landroidx/lifecycle/l$a;", "event", "onEvent", "d2", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "onPause", "LKi/M;", "Lx0/c1;", "scaffoldState", "Lps/F;", "drawerHeader", "Lps/t;", "drawerDecorator", "Lcom/meijer/mobile/mperks/ux/V$c;", "pointsBalanceState", "", "", "tabList", "Landroidx/compose/ui/Modifier;", "modifier", "S1", "(LKi/M;Lx0/c1;Lps/F;Lps/t;Lcom/meijer/mobile/mperks/ux/V$c;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "pointsBalance", "", "isToAvailablePill", "Lo0/C;", "pagerState", "Lko/d;", "claimTabViewState", "Lqo/M;", "rewardsViewState", "Loo/v;", "earnInProgressState", "pointsBalanceViewState", "showWalkThruBanner", "isDashboardSimplifiedUIEnabled", "Lkotlin/Function0;", "onRetryClicked", "Lkotlin/Function1;", "setWalkThruBannerVisibility", "onViewDisclaimersBottomSheetClick", "onRewardsTabSelected", "onEarnTabSelected", "onClaimTabSelected", "", "onCalculateAboveTabsSectionHeight", "h2", "(LKi/M;ILjava/util/List;ZLo0/C;Lko/d;Lqo/M;Loo/v;Lcom/meijer/mobile/mperks/ux/V$c;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "isPointsBalanceUpdated", "earnTabIndex", "Lco/d;", "selectedClaimTabPill", "onClaimTabPillSelected", "b2", "(LKi/M;Lo0/C;Ljava/util/List;IZLqo/M;Lko/d;ILco/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Loo/v;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "Lco/h;", "navigationRequest", "D3", "(Lco/h;)V", "Lg/a;", "result", "r3", "(Lg/a;)V", "t3", "(Ljava/util/List;)V", "Lko/c;", "Lmv/O;", "coroutineScope", "C3", "(LKi/M;Lko/c;Lmv/O;)V", "pointBalance", "", "availableRewards", "F3", "(ILjava/util/List;)V", "rewardsInProgressList", "rewardsAvailableList", "Lco/f;", "tab", "P3", "(ILjava/lang/String;Ljava/lang/String;Lco/f;)V", "claimRewards", "M3", "Lco/g;", "earnReward", "isBoosterReward", "navigatedFrom", "isShoppableReward", "B3", "(Lco/g;ZLjava/lang/String;IZ)V", "rewardId", "R3", "(Ljava/lang/String;Ljava/lang/String;)V", "Lco/e;", "clippedReward", "E3", "(Lco/e;)V", "Lco/c;", "claimReward", "A3", "(Lco/c;)V", "Q3", "claimAction", "Lco/a;", "autoClaimReward", "G3", "(Ljava/lang/String;Lco/a;)V", "selectedClaimSubPill", "K3", "(Lco/d;I)V", "Lcom/meijer/mobile/mperks/ux/V$b;", "s3", "(Lcom/meijer/mobile/mperks/ux/V$b;)V", "I3", "state", "T3", "N3", "(Ljava/lang/String;)V", "Lcom/meijer/mobile/mperks/ux/V;", "D", "Lkotlin/Lazy;", "m3", "()Lcom/meijer/mobile/mperks/ux/V;", "dashBoardViewModel", "Lqo/I;", "E", "q3", "()Lqo/I;", "rewardsViewModel", "Lko/z;", "F", "l3", "()Lko/z;", "claimTabViewModel", "Loo/a0;", "G", "n3", "()Loo/a0;", "earnTabViewModel", "H", "Lo0/C;", "I", "Lmv/O;", "J", "Z", "isWalkThruTriggered", "Lps/g;", "K", "p3", "()Lps/g;", "navigationHelper", "Lps/L;", "L", "o3", "()Lps/L;", "navigationDrawerViewModel", "M", "Ljava/lang/String;", "previousTrackAction", "N", "mperksPointBalance", "O", "isRewardsTabAnalyticsSent", "P", "isEarnTabAnalyticsSent", "Q", "isClaimTabAnalyticsSent", "R", "S", "navigateFromHomeScreen", "Lg/c;", "T", "Lg/c;", "autoClaimDetailActivityLauncher", "Lcom/fullstory/FSPage;", "kotlin.jvm.PlatformType", "U", "Lcom/fullstory/FSPage;", "fsPage", "V", "Ljava/util/List;", "previewTabList", "x3", "()Z", "isToEarnRewardTab", "w3", "isToClaimRewardsTab", "y3", "isToRewardsTab", "v3", "u3", "isFromLearnToEarn", "W", "a", "expandedBannerHeightPxDynamic", "truncatedBannerHeightPxDynamic", "aboveTabsSectionHeight", "earnPillsIndex", "lastAction", "isDashboardSimplifiedUI", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class MperksDashBoardActivity extends Hilt_MperksDashBoardActivity {

    /* renamed from: X, reason: collision with root package name */
    public static final int f114568X = 8;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private AbstractC16037C pagerState;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15783O coroutineScope;

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
    private final Lazy rewardsViewModel = new androidx.view.e0(Reflection.b(C16717I.class), new D(this), new C(this), new E(null, this));

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final Lazy claimTabViewModel = new androidx.view.e0(Reflection.b(ko.z.class), new G(this), new F(this), new H(null, this));

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final Lazy earnTabViewModel = new androidx.view.e0(Reflection.b(oo.a0.class), new u(this), new t(this), new v(null, this));

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationHelper = LazyKt.b(new Function0() { // from class: com.meijer.mobile.mperks.ux.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MperksDashBoardActivity.z3(this.f115228a);
        }
    });

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationDrawerViewModel = new androidx.view.e0(Reflection.b(C16508L.class), new x(this), new w(this), new y(null, this));

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean isRewardsTabAnalyticsSent = true;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean isEarnTabAnalyticsSent = true;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private int earnTabIndex = -1;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private boolean navigateFromHomeScreen = true;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> autoClaimDetailActivityLauncher = registerForActivityResult(new h.i(), new j());

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final FSPage fsPage = FS.page("mPerks | Home Page");

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> previewTabList = CollectionsKt.p(Integer.valueOf(j0.f115062D), Integer.valueOf(j0.f115140c0));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class A extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114588f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(ComponentActivity componentActivity) {
            super(0);
            this.f114588f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f114588f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class B extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f114589f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114590g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f114589f = function0;
            this.f114590g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f114589f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f114590g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class C extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114591f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(ComponentActivity componentActivity) {
            super(0);
            this.f114591f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f114591f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class D extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114592f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D(ComponentActivity componentActivity) {
            super(0);
            this.f114592f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f114592f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class E extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f114593f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114594g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public E(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f114593f = function0;
            this.f114594g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f114593f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f114594g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class F extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114595f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(ComponentActivity componentActivity) {
            super(0);
            this.f114595f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f114595f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class G extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114596f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public G(ComponentActivity componentActivity) {
            super(0);
            this.f114596f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f114596f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class H extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f114597f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114598g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f114597f = function0;
            this.f114598g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f114597f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f114598g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$b, reason: case insensitive filesystem */
    static final class C12779b implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f114599a;

        C12779b(LocalThemeScope localThemeScope) {
            this.f114599a = localThemeScope;
        }

        public final void a(InterfaceC14902f ModalBottomSheetLayout, Composer composer, int i10) {
            Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2034044851, i10, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.DashBoardScreen.<anonymous> (MperksDashBoardActivity.kt:389)");
            }
            C15544D.c(this.f114599a, null, composer, LocalThemeScope.f17314g, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            a(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c, reason: case insensitive filesystem */
    static final class C12780c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C17993c1 f114600a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MperksDashBoardActivity f114601b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f114602c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ HeaderDecorator f114603d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ DrawerLayoutDecorator f114604e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d0.V f114605f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5866i0 f114606g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5866i0 f114607h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5866i0 f114608i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ V.PointsBalanceViewState f114609j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f114610k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ List<Integer> f114611l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ C17959M0 f114612m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ z1<ClaimTabState> f114613n;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MperksDashBoardActivity f114614a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f114615b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1807a extends FunctionReferenceImpl implements Function0<Unit> {
                C1807a(Object obj) {
                    super(0, obj, C16521g.class, "openDrawer", "openDrawer()V", 0);
                }

                public final void a() {
                    ((C16521g) this.receiver).j();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    a();
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$a$b */
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f114616a;

                b(LocalThemeScope localThemeScope) {
                    this.f114616a = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-813565327, i10, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.DashBoardScreen.<anonymous>.<anonymous>.<anonymous> (MperksDashBoardActivity.kt:403)");
                    }
                    Dr.g.g(this.f114616a, C16338g.c(j0.f115084K0, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f143329a;
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
                AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(j0.f115117V0, new Object[0]);
                C.a.s sVar = C.a.s.f16902e;
                C16521g c16521gP3 = this.f114614a.p3();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(c16521gP3);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1807a(c16521gP3);
                    composer.t(objB);
                }
                composer.P();
                LocalThemeScope localThemeScope = this.f114615b;
                Dr.g.f(localThemeScope, null, null, null, ComposableLambdaKt.c(-813565327, true, new b(localThemeScope), composer, 54), (Function0) ((KFunction) objB), sVar, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24576 | (C.a.s.f16903f << 18) | (AbstractC6392a.f60445b << 27), 199);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            a(MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope) {
                this.f114614a = mperksDashBoardActivity;
                this.f114615b = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$b */
        static final class b implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MperksDashBoardActivity f114617a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f114618b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ HeaderDecorator f114619c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ DrawerLayoutDecorator f114620d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$b$a */
            /* synthetic */ class a extends FunctionReferenceImpl implements Function1<AbstractC16499C, Unit> {
                a(Object obj) {
                    super(1, obj, C16521g.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/ui/navigation/DrawerNavigationRequest;)V", 0);
                }

                public final void a(AbstractC16499C p02) {
                    Intrinsics.j(p02, "p0");
                    ((C16521g) this.receiver).h(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AbstractC16499C abstractC16499C) {
                    a(abstractC16499C);
                    return Unit.f143329a;
                }
            }

            b(MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope, HeaderDecorator headerDecorator, DrawerLayoutDecorator drawerLayoutDecorator) {
                this.f114617a = mperksDashBoardActivity;
                this.f114618b = localThemeScope;
                this.f114619c = headerDecorator;
                this.f114620d = drawerLayoutDecorator;
            }

            public final void a(InterfaceC14902f Scaffold, Composer composer, int i10) throws XmlPullParserException, Resources.NotFoundException {
                Intrinsics.j(Scaffold, "$this$Scaffold");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1839254329, i10, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.DashBoardScreen.<anonymous>.<anonymous> (MperksDashBoardActivity.kt:411)");
                }
                C16521g c16521gP3 = this.f114617a.p3();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(c16521gP3);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new a(c16521gP3);
                    composer.t(objB);
                }
                composer.P();
                C16498B.h(this.f114618b, this.f114619c, this.f114620d, this.f114617a.q1(), null, (Function1) ((KFunction) objB), composer, LocalThemeScope.f17314g | (HeaderDecorator.f157113i << 3) | (DrawerLayoutDecorator.f157377h << 6), 8);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) throws XmlPullParserException, Resources.NotFoundException {
                a(interfaceC14902f, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$c, reason: collision with other inner class name */
        static final class C1808c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MperksDashBoardActivity f114621a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0.V f114622b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f114623c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5866i0 f114624d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5866i0 f114625e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5866i0 f114626f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ HeaderDecorator f114627g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ V.PointsBalanceViewState f114628h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f114629i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ List<Integer> f114630j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ C17959M0 f114631k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ z1<ClaimTabState> f114632l;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$DashBoardScreen$2$3$1$1", f = "MperksDashBoardActivity.kt", l = {432}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$c$a */
            static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f114633a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ d0.V f114634b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ float f114635c;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f114634b, this.f114635c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(d0.V v10, float f10, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f114634b = v10;
                    this.f114635c = f10;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f114633a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        float fO = this.f114634b.o();
                        float f10 = this.f114635c;
                        if (fO >= f10) {
                            this.f114633a = 1;
                            if (d0.V.l(this.f114634b, (int) f10, null, this, 2, null) == objF) {
                                return objF;
                            }
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$DashBoardScreen$2$3$2$1$5$1$1", f = "MperksDashBoardActivity.kt", l = {483}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$c$b */
            static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f114636a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17959M0 f114637b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f114637b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C17959M0 c17959m0, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f114637b = c17959m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f114636a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17959M0 c17959m0 = this.f114637b;
                        this.f114636a = 1;
                        if (c17959m0.l(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$c$c, reason: collision with other inner class name */
            static final class C1809c implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List<Integer> f114638a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ MperksDashBoardActivity f114639b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f114640c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<RewardsViewState> f114641d;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$DashBoardScreen$2$3$2$2$2$1$1$1$1", f = "MperksDashBoardActivity.kt", l = {542}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$c$c$a */
                static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f114642a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ MperksDashBoardActivity f114643b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ int f114644c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(MperksDashBoardActivity mperksDashBoardActivity, int i10, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.f114643b = mperksDashBoardActivity;
                        this.f114644c = i10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new a(this.f114643b, this.f114644c, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f114642a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            AbstractC16037C abstractC16037C = this.f114643b.pagerState;
                            if (abstractC16037C == null) {
                                Intrinsics.x("pagerState");
                                abstractC16037C = null;
                            }
                            int i11 = this.f114644c;
                            this.f114642a = 1;
                            if (AbstractC16037C.n(abstractC16037C, i11, 0.0f, null, this, 6, null) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$c$c$b */
                static final class b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f114645a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ MperksDashBoardActivity f114646b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ int f114647c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ int f114648d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ z1<RewardsViewState> f114649e;

                    b(LocalThemeScope localThemeScope, MperksDashBoardActivity mperksDashBoardActivity, int i10, int i11, z1<RewardsViewState> z1Var) {
                        this.f114645a = localThemeScope;
                        this.f114646b = mperksDashBoardActivity;
                        this.f114647c = i10;
                        this.f114648d = i11;
                        this.f114649e = z1Var;
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
                        LocalThemeScope localThemeScope = this.f114645a;
                        Ki.I seven = localThemeScope.getAdsTypography().getHeadings().getSeven();
                        AbstractC16037C abstractC16037C = this.f114646b.pagerState;
                        if (abstractC16037C == null) {
                            Intrinsics.x("pagerState");
                            abstractC16037C = null;
                        }
                        q1.Label label = new q1.Label(null, abstractC16037C.v() == this.f114647c ? this.f114645a.getAdsColors().getAdsColorText03() : this.f114645a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, seven, null, 349, null);
                        if (this.f114648d == j0.f115067E1) {
                            composer.startReplaceGroup(-749035072);
                            if (C1808c.s(this.f114649e).c().isEmpty()) {
                                composer.startReplaceGroup(-748501469);
                                strC = C16338g.c(j0.f115070F1, composer, 0);
                                composer.P();
                            } else {
                                composer.startReplaceGroup(-748945017);
                                strC = C16338g.d(this.f114648d, new Object[]{String.valueOf(C1808c.s(this.f114649e).c().size())}, composer, 0);
                                composer.P();
                            }
                            composer.P();
                        } else {
                            composer.startReplaceGroup(-301232781);
                            strC = C16338g.c(this.f114648d, composer, 0);
                            composer.P();
                        }
                        si.j.h(localThemeScope, label, strC, null, composer, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                        a(composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                C1809c(List<Integer> list, MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope, z1<RewardsViewState> z1Var) {
                    this.f114638a = list;
                    this.f114639b = mperksDashBoardActivity;
                    this.f114640c = localThemeScope;
                    this.f114641d = z1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(int i10, MperksDashBoardActivity mperksDashBoardActivity, int i11) {
                    InterfaceC15783O interfaceC15783O;
                    if (i10 == j0.f115067E1) {
                        mperksDashBoardActivity.isRewardsTabAnalyticsSent = false;
                    } else if (i10 == j0.f115140c0) {
                        mperksDashBoardActivity.isEarnTabAnalyticsSent = false;
                    } else if (i10 == j0.f115062D) {
                        mperksDashBoardActivity.isClaimTabAnalyticsSent = false;
                    }
                    InterfaceC15783O interfaceC15783O2 = mperksDashBoardActivity.coroutineScope;
                    if (interfaceC15783O2 == null) {
                        Intrinsics.x("coroutineScope");
                        interfaceC15783O = null;
                    } else {
                        interfaceC15783O = interfaceC15783O2;
                    }
                    C15809k.d(interfaceC15783O, null, null, new a(mperksDashBoardActivity, i11, null), 3, null);
                    return Unit.f143329a;
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
                    List<Integer> list = this.f114638a;
                    final MperksDashBoardActivity mperksDashBoardActivity = this.f114639b;
                    LocalThemeScope localThemeScope = this.f114640c;
                    z1<RewardsViewState> z1Var = this.f114641d;
                    final int i11 = 0;
                    for (Object obj : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.w();
                        }
                        final int iIntValue = ((Number) obj).intValue();
                        AbstractC16037C abstractC16037C = mperksDashBoardActivity.pagerState;
                        if (abstractC16037C == null) {
                            Intrinsics.x("pagerState");
                            abstractC16037C = null;
                        }
                        boolean z10 = i11 == abstractC16037C.v();
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
                                    return MperksDashBoardActivity.C12780c.C1808c.C1809c.c(iIntValue, mperksDashBoardActivity, i11);
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
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$DashBoardScreen$2$3$3$1", f = "MperksDashBoardActivity.kt", l = {580}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$c$d */
            static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f114650a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f114651b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ MperksDashBoardActivity f114652c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f114653d;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lko/c;", "it", "", "<anonymous>", "(Lko/c;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$DashBoardScreen$2$3$3$1$1", f = "MperksDashBoardActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$c$c$d$a */
                static final class a extends SuspendLambda implements Function2<AbstractC15305c, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f114654a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f114655b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ MperksDashBoardActivity f114656c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f114657d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ InterfaceC15783O f114658e;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        a aVar = new a(this.f114656c, this.f114657d, this.f114658e, continuation);
                        aVar.f114655b = obj;
                        return aVar;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope, InterfaceC15783O interfaceC15783O, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.f114656c = mperksDashBoardActivity;
                        this.f114657d = localThemeScope;
                        this.f114658e = interfaceC15783O;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(AbstractC15305c abstractC15305c, Continuation<? super Unit> continuation) {
                        return ((a) create(abstractC15305c, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.f();
                        if (this.f114654a == 0) {
                            ResultKt.b(obj);
                            this.f114656c.C3(this.f114657d, (AbstractC15305c) this.f114655b, this.f114658e);
                            return Unit.f143329a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    d dVar = new d(this.f114652c, this.f114653d, continuation);
                    dVar.f114651b = obj;
                    return dVar;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f114652c = mperksDashBoardActivity;
                    this.f114653d = localThemeScope;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f114650a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f114651b;
                        InterfaceC16561f interfaceC16561fO = C16563h.O(this.f114652c.l3().B(), new a(this.f114652c, this.f114653d, interfaceC15783O, null));
                        this.f114651b = interfaceC15783O;
                        this.f114650a = 1;
                        if (C16563h.j(interfaceC16561fO, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit w(MperksDashBoardActivity mperksDashBoardActivity) {
                mperksDashBoardActivity.isRewardsTabAnalyticsSent = false;
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit x(MperksDashBoardActivity mperksDashBoardActivity) {
                mperksDashBoardActivity.isEarnTabAnalyticsSent = false;
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit y(MperksDashBoardActivity mperksDashBoardActivity) {
                mperksDashBoardActivity.isClaimTabAnalyticsSent = false;
                return Unit.f143329a;
            }

            C1808c(MperksDashBoardActivity mperksDashBoardActivity, d0.V v10, LocalThemeScope localThemeScope, InterfaceC5866i0 interfaceC5866i0, InterfaceC5866i0 interfaceC5866i02, InterfaceC5866i0 interfaceC5866i03, HeaderDecorator headerDecorator, V.PointsBalanceViewState pointsBalanceViewState, boolean z10, List<Integer> list, C17959M0 c17959m0, z1<ClaimTabState> z1Var) {
                this.f114621a = mperksDashBoardActivity;
                this.f114622b = v10;
                this.f114623c = localThemeScope;
                this.f114624d = interfaceC5866i0;
                this.f114625e = interfaceC5866i02;
                this.f114626f = interfaceC5866i03;
                this.f114627g = headerDecorator;
                this.f114628h = pointsBalanceViewState;
                this.f114629i = z10;
                this.f114630j = list;
                this.f114631k = c17959m0;
                this.f114632l = z1Var;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) throws NumberFormatException {
                q(interfaceC14882C, composer, num.intValue());
                return Unit.f143329a;
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
            public final void q(j0.InterfaceC14882C r40, androidx.compose.runtime.Composer r41, int r42) throws java.lang.NumberFormatException {
                /*
                    Method dump skipped, instructions count: 1484
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.MperksDashBoardActivity.C12780c.C1808c.q(j0.C, androidx.compose.runtime.Composer, int):void");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit A(InterfaceC5866i0 interfaceC5866i0, float f10) {
                MperksDashBoardActivity.X1(interfaceC5866i0, f10);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit B(MperksDashBoardActivity mperksDashBoardActivity) {
                mperksDashBoardActivity.m3().D(V.a.l.f114777a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit C(InterfaceC5866i0 interfaceC5866i0, float f10) {
                MperksDashBoardActivity.Z1(interfaceC5866i0, f10);
                return Unit.f143329a;
            }

            private static final boolean D(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                return interfaceC5872l0.getValue().booleanValue();
            }

            private static final void E(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                interfaceC5872l0.setValue(Boolean.valueOf(z10));
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
                mperksDashBoardActivity.q3().s(AbstractC16740o.c.f158878a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit u(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                E(interfaceC5872l0, z10);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit v(MperksDashBoardActivity mperksDashBoardActivity, C17959M0 c17959m0) {
                InterfaceC15783O interfaceC15783O;
                InterfaceC15783O interfaceC15783O2 = mperksDashBoardActivity.coroutineScope;
                if (interfaceC15783O2 == null) {
                    Intrinsics.x("coroutineScope");
                    interfaceC15783O = null;
                } else {
                    interfaceC15783O = interfaceC15783O2;
                }
                C15809k.d(interfaceC15783O, null, null, new b(c17959m0, null), 3, null);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit z(InterfaceC5866i0 interfaceC5866i0, float f10) {
                MperksDashBoardActivity.U1(interfaceC5866i0, f10);
                return Unit.f143329a;
            }
        }

        C12780c(C17993c1 c17993c1, MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope, HeaderDecorator headerDecorator, DrawerLayoutDecorator drawerLayoutDecorator, d0.V v10, InterfaceC5866i0 interfaceC5866i0, InterfaceC5866i0 interfaceC5866i02, InterfaceC5866i0 interfaceC5866i03, V.PointsBalanceViewState pointsBalanceViewState, boolean z10, List<Integer> list, C17959M0 c17959m0, z1<ClaimTabState> z1Var) {
            this.f114600a = c17993c1;
            this.f114601b = mperksDashBoardActivity;
            this.f114602c = localThemeScope;
            this.f114603d = headerDecorator;
            this.f114604e = drawerLayoutDecorator;
            this.f114605f = v10;
            this.f114606g = interfaceC5866i0;
            this.f114607h = interfaceC5866i02;
            this.f114608i = interfaceC5866i03;
            this.f114609j = pointsBalanceViewState;
            this.f114610k = z10;
            this.f114611l = list;
            this.f114612m = c17959m0;
            this.f114613n = z1Var;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-594234196, i10, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.DashBoardScreen.<anonymous> (MperksDashBoardActivity.kt:398)");
            }
            C17987a1.a(null, this.f114600a, ComposableLambdaKt.c(-1019742799, true, new a(this.f114601b, this.f114602c), composer, 54), null, null, null, 0, false, ComposableLambdaKt.c(-1839254329, true, new b(this.f114601b, this.f114602c, this.f114603d, this.f114604e), composer, 54), false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-1087691030, true, new C1808c(this.f114601b, this.f114605f, this.f114602c, this.f114606g, this.f114607h, this.f114608i, this.f114603d, this.f114609j, this.f114610k, this.f114611l, this.f114612m, this.f114613n), composer, 54), composer, 100663680, 12582912, 130809);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$d, reason: case insensitive filesystem */
    static final class C12781d implements Function4<InterfaceC16060u, Integer, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<Integer> f114659a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MperksDashBoardActivity f114660b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f114661c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ RewardsViewState f114662d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ PointsExpState f114663e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f114664f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f114665g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ EarnAvailableViewState f114666h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ MccEnrollmentState f114667i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ EarnInProgressState f114668j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f114669k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f114670l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f114671m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ClaimTabState f114672n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ EnumC6532d f114673o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC6532d, Unit> f114674p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$d$a */
        /* synthetic */ class a extends FunctionReferenceImpl implements Function1<AbstractC6536h, Unit> {
            a(Object obj) {
                super(1, obj, MperksDashBoardActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/mperks/model/common/MperksNavigationRequest;)V", 0);
            }

            public final void a(AbstractC6536h p02) {
                Intrinsics.j(p02, "p0");
                ((MperksDashBoardActivity) this.receiver).D3(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AbstractC6536h abstractC6536h) {
                a(abstractC6536h);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$d$b */
        /* synthetic */ class b extends FunctionReferenceImpl implements Function1<AbstractC6536h, Unit> {
            b(Object obj) {
                super(1, obj, MperksDashBoardActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/mperks/model/common/MperksNavigationRequest;)V", 0);
            }

            public final void a(AbstractC6536h p02) {
                Intrinsics.j(p02, "p0");
                ((MperksDashBoardActivity) this.receiver).D3(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AbstractC6536h abstractC6536h) {
                a(abstractC6536h);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$d$c */
        /* synthetic */ class c extends FunctionReferenceImpl implements Function1<AbstractC6536h, Unit> {
            c(Object obj) {
                super(1, obj, MperksDashBoardActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/mperks/model/common/MperksNavigationRequest;)V", 0);
            }

            public final void a(AbstractC6536h p02) {
                Intrinsics.j(p02, "p0");
                ((MperksDashBoardActivity) this.receiver).D3(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AbstractC6536h abstractC6536h) {
                a(abstractC6536h);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C12781d(List<Integer> list, MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope, RewardsViewState rewardsViewState, PointsExpState pointsExpState, Function0<Unit> function0, boolean z10, EarnAvailableViewState earnAvailableViewState, MccEnrollmentState mccEnrollmentState, EarnInProgressState earnInProgressState, int i10, Function1<? super Integer, Unit> function1, int i11, ClaimTabState claimTabState, EnumC6532d enumC6532d, Function1<? super EnumC6532d, Unit> function12) {
            this.f114659a = list;
            this.f114660b = mperksDashBoardActivity;
            this.f114661c = localThemeScope;
            this.f114662d = rewardsViewState;
            this.f114663e = pointsExpState;
            this.f114664f = function0;
            this.f114665g = z10;
            this.f114666h = earnAvailableViewState;
            this.f114667i = mccEnrollmentState;
            this.f114668j = earnInProgressState;
            this.f114669k = i10;
            this.f114670l = function1;
            this.f114671m = i11;
            this.f114672n = claimTabState;
            this.f114673o = enumC6532d;
            this.f114674p = function12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(MperksDashBoardActivity mperksDashBoardActivity, GoogleAdAnalytics googleAnalytics) {
            Intrinsics.j(googleAnalytics, "googleAnalytics");
            mperksDashBoardActivity.m3().D(new V.a.GoogleAdClicked(googleAnalytics));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(MperksDashBoardActivity mperksDashBoardActivity, ClaimTabState claimTabState, AbstractC6537i action) {
            Intrinsics.j(action, "action");
            if (Intrinsics.e(action, AbstractC6537i.m.f62775a)) {
                int i10 = mperksDashBoardActivity.mperksPointBalance;
                List<ClaimReward> listD = claimTabState.d();
                ArrayList arrayList = new ArrayList(CollectionsKt.x(listD, 10));
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((ClaimReward) it.next()).getCouponId()));
                }
                mperksDashBoardActivity.M3(i10, arrayList);
            } else if (action instanceof AbstractC6537i.BuyReward) {
                mperksDashBoardActivity.l3().E(new AbstractC15303a.BuyReward(((AbstractC6537i.BuyReward) action).getClaimReward()));
            } else if (action instanceof AbstractC6537i.AutoClaimEnroll) {
                AbstractC6537i.AutoClaimEnroll autoClaimEnroll = (AbstractC6537i.AutoClaimEnroll) action;
                mperksDashBoardActivity.l3().E(new AbstractC15303a.AutoClaimAction(autoClaimEnroll.getEnroll(), autoClaimEnroll.getAutoClaimType(), autoClaimEnroll.getAutoClaimAmount()));
            } else if (action instanceof AbstractC6537i.TrackAutoClaimAction) {
                AbstractC6537i.TrackAutoClaimAction trackAutoClaimAction = (AbstractC6537i.TrackAutoClaimAction) action;
                mperksDashBoardActivity.G3(trackAutoClaimAction.getClaimAction(), trackAutoClaimAction.getAutoClaimReward());
            } else if (action instanceof AbstractC6537i.OnConfirmingSwitchClick) {
                AbstractC6537i.OnConfirmingSwitchClick onConfirmingSwitchClick = (AbstractC6537i.OnConfirmingSwitchClick) action;
                mperksDashBoardActivity.l3().E(new AbstractC15303a.ShowSwitchingButtonsAction(onConfirmingSwitchClick.getIsShowSwitchingButtons(), onConfirmingSwitchClick.getAutoClaimReward()));
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(boolean z10, RewardsViewState rewardsViewState, MperksDashBoardActivity mperksDashBoardActivity, AbstractC6537i action) {
            Intrinsics.j(action, "action");
            if (Intrinsics.e(action, AbstractC6537i.o.f62777a) && z10 && rewardsViewState.getIsRewardsUpdated() && (!mperksDashBoardActivity.isRewardsTabAnalyticsSent || (mperksDashBoardActivity.navigateFromHomeScreen && !mperksDashBoardActivity.u3()))) {
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
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(EarnAvailableViewState earnAvailableViewState, EarnInProgressState earnInProgressState, MperksDashBoardActivity mperksDashBoardActivity, int i10, Function1 function1, AbstractC6537i action) {
            Intrinsics.j(action, "action");
            if (action instanceof AbstractC6537i.TrackEarnPillState) {
                mperksDashBoardActivity.P3(i10, CollectionsKt.B0(earnInProgressState.d(), ",", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.mperks.ux.L
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MperksDashBoardActivity.C12781d.r((EarnReward) obj);
                    }
                }, 30, null), CollectionsKt.B0(earnAvailableViewState.c(), ",", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.mperks.ux.K
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MperksDashBoardActivity.C12781d.q((EarnReward) obj);
                    }
                }, 30, null), ((AbstractC6537i.TrackEarnPillState) action).getEarnPills());
            } else if (action instanceof AbstractC6537i.EarnTabAnalyticsFlagUpdate) {
                AbstractC6537i.EarnTabAnalyticsFlagUpdate earnTabAnalyticsFlagUpdate = (AbstractC6537i.EarnTabAnalyticsFlagUpdate) action;
                mperksDashBoardActivity.isEarnTabAnalyticsSent = earnTabAnalyticsFlagUpdate.getIsEarnTabAnalyticsSent();
                function1.invoke(Integer.valueOf(earnTabAnalyticsFlagUpdate.getTab().ordinal()));
                mperksDashBoardActivity.fsPage.updateProperties(MapsKt.g(TuplesKt.a("earnCategory", earnTabAnalyticsFlagUpdate.getTab().name())));
            } else if (action instanceof AbstractC6537i.EarnRewardCardClicked) {
                AbstractC6537i.EarnRewardCardClicked earnRewardCardClicked = (AbstractC6537i.EarnRewardCardClicked) action;
                mperksDashBoardActivity.B3(earnRewardCardClicked.getEarnReward(), earnRewardCardClicked.getIsBoosterReward(), earnRewardCardClicked.getNavigatedFrom(), i10, earnRewardCardClicked.getIsShoppableReward());
            } else if (action instanceof AbstractC6537i.OnTrackShopNowButtonClick) {
                mperksDashBoardActivity.R3(((AbstractC6537i.OnTrackShopNowButtonClick) action).getRewardId(), String.valueOf(i10));
            }
            return Unit.f143329a;
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

        public final void g(InterfaceC16060u HorizontalPager, int i10, Composer composer, int i11) {
            Intrinsics.j(HorizontalPager, "$this$HorizontalPager");
            if (ComposerKt.M()) {
                ComposerKt.U(-1101263701, i11, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.NavigationComponent.<anonymous>.<anonymous> (MperksDashBoardActivity.kt:769)");
            }
            int iIntValue = this.f114659a.get(i10).intValue();
            if (iIntValue == j0.f115067E1) {
                composer.startReplaceGroup(1508415972);
                MperksDashBoardActivity mperksDashBoardActivity = this.f114660b;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(mperksDashBoardActivity);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new a(mperksDashBoardActivity);
                    composer.t(objB);
                }
                KFunction kFunction = (KFunction) objB;
                composer.P();
                LocalThemeScope localThemeScope = this.f114661c;
                RewardsViewState rewardsViewState = this.f114662d;
                PointsExpState pointsExpState = this.f114663e;
                Function0<Unit> function0 = this.f114664f;
                Function1 function1 = (Function1) kFunction;
                composer.startReplaceGroup(-1746271574);
                boolean zA = composer.a(this.f114665g) | composer.V(this.f114662d) | composer.D(this.f114660b);
                final boolean z10 = this.f114665g;
                final RewardsViewState rewardsViewState2 = this.f114662d;
                final MperksDashBoardActivity mperksDashBoardActivity2 = this.f114660b;
                Object objB2 = composer.B();
                if (zA || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.mperks.ux.G
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MperksDashBoardActivity.C12781d.o(z10, rewardsViewState2, mperksDashBoardActivity2, (AbstractC6537i) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                C16710B.w(localThemeScope, rewardsViewState, pointsExpState, null, function0, function1, (Function1) objB2, composer, LocalThemeScope.f17314g, 4);
                composer.P();
            } else if (iIntValue == j0.f115140c0) {
                composer.startReplaceGroup(1510628752);
                boolean zE = this.f114660b.s1().e(AbstractC18503f.I.f172848h);
                MperksDashBoardActivity mperksDashBoardActivity3 = this.f114660b;
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(mperksDashBoardActivity3);
                Object objB3 = composer.B();
                if (zD2 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new b(mperksDashBoardActivity3);
                    composer.t(objB3);
                }
                KFunction kFunction2 = (KFunction) objB3;
                composer.P();
                GoogleAdData googleAdData = this.f114666h.getGoogleAdData();
                LocalThemeScope localThemeScope2 = this.f114661c;
                PointsExpState pointsExpState2 = this.f114663e;
                EarnAvailableViewState earnAvailableViewState = this.f114666h;
                MccEnrollmentState mccEnrollmentState = this.f114667i;
                EarnInProgressState earnInProgressState = this.f114668j;
                int i12 = this.f114669k;
                Function1<Integer, Unit> function12 = this.f114670l;
                Function0<Unit> function02 = this.f114664f;
                Function1 function13 = (Function1) kFunction2;
                composer.startReplaceGroup(-1224400529);
                boolean zD3 = composer.D(this.f114666h) | composer.D(this.f114668j) | composer.D(this.f114660b) | composer.d(this.f114671m) | composer.V(this.f114670l);
                final EarnAvailableViewState earnAvailableViewState2 = this.f114666h;
                final EarnInProgressState earnInProgressState2 = this.f114668j;
                final MperksDashBoardActivity mperksDashBoardActivity4 = this.f114660b;
                final int i13 = this.f114671m;
                final Function1<Integer, Unit> function14 = this.f114670l;
                Object objB4 = composer.B();
                if (zD3 || objB4 == Composer.INSTANCE.a()) {
                    Function1 function15 = new Function1() { // from class: com.meijer.mobile.mperks.ux.H
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MperksDashBoardActivity.C12781d.p(earnAvailableViewState2, earnInProgressState2, mperksDashBoardActivity4, i13, function14, (AbstractC6537i) obj);
                        }
                    };
                    composer.t(function15);
                    objB4 = function15;
                }
                Function1 function16 = (Function1) objB4;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD4 = composer.D(this.f114660b);
                final MperksDashBoardActivity mperksDashBoardActivity5 = this.f114660b;
                Object objB5 = composer.B();
                if (zD4 || objB5 == Composer.INSTANCE.a()) {
                    objB5 = new Function1() { // from class: com.meijer.mobile.mperks.ux.I
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MperksDashBoardActivity.C12781d.k(mperksDashBoardActivity5, (GoogleAdAnalytics) obj);
                        }
                    };
                    composer.t(objB5);
                }
                composer.P();
                oo.W.i(localThemeScope2, pointsExpState2, earnAvailableViewState, mccEnrollmentState, earnInProgressState, i12, zE, null, googleAdData, function12, function02, function13, function16, (Function1) objB5, composer, LocalThemeScope.f17314g | (GoogleAdData.f134248f << 24), 0, 64);
                composer.P();
            } else {
                composer.startReplaceGroup(1514568945);
                boolean zE2 = this.f114660b.s1().e(AbstractC18503f.I.f172848h);
                MperksDashBoardActivity mperksDashBoardActivity6 = this.f114660b;
                composer.startReplaceGroup(5004770);
                boolean zD5 = composer.D(mperksDashBoardActivity6);
                Object objB6 = composer.B();
                if (zD5 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new c(mperksDashBoardActivity6);
                    composer.t(objB6);
                }
                KFunction kFunction3 = (KFunction) objB6;
                composer.P();
                LocalThemeScope localThemeScope3 = this.f114661c;
                int i14 = this.f114671m;
                ClaimTabState claimTabState = this.f114672n;
                PointsExpState pointsExpState3 = this.f114663e;
                EnumC6532d enumC6532d = this.f114673o;
                Function0<Unit> function03 = this.f114664f;
                Function1<EnumC6532d, Unit> function17 = this.f114674p;
                Function1 function18 = (Function1) kFunction3;
                composer.startReplaceGroup(-1633490746);
                boolean zD6 = composer.D(this.f114660b) | composer.V(this.f114672n);
                final MperksDashBoardActivity mperksDashBoardActivity7 = this.f114660b;
                final ClaimTabState claimTabState2 = this.f114672n;
                Object objB7 = composer.B();
                if (zD6 || objB7 == Composer.INSTANCE.a()) {
                    objB7 = new Function1() { // from class: com.meijer.mobile.mperks.ux.J
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MperksDashBoardActivity.C12781d.l(mperksDashBoardActivity7, claimTabState2, (AbstractC6537i) obj);
                        }
                    };
                    composer.t(objB7);
                }
                composer.P();
                ko.u.H(localThemeScope3, i14, claimTabState, pointsExpState3, enumC6532d, zE2, null, function03, function17, function18, (Function1) objB7, composer, LocalThemeScope.f17314g, 0, 32);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC16060u interfaceC16060u, Integer num, Composer composer, Integer num2) {
            g(interfaceC16060u, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/meijer/mobile/mperks/ux/MperksDashBoardActivity$e", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$e, reason: case insensitive filesystem */
    public static final class C12782e implements androidx.compose.runtime.E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6165l f114675a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6169p f114676b;

        public C12782e(AbstractC6165l abstractC6165l, InterfaceC6169p interfaceC6169p) {
            this.f114675a = abstractC6165l;
            this.f114676b = interfaceC6169p;
        }

        @Override // androidx.compose.runtime.E
        public void dispose() {
            this.f114675a.d(this.f114676b);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$f, reason: case insensitive filesystem */
    /* synthetic */ class C12783f extends FunctionReferenceImpl implements Function1<AbstractC6536h, Unit> {
        C12783f(Object obj) {
            super(1, obj, MperksDashBoardActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/mperks/model/common/MperksNavigationRequest;)V", 0);
        }

        public final void a(AbstractC6536h p02) {
            Intrinsics.j(p02, "p0");
            ((MperksDashBoardActivity) this.receiver).D3(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC6536h abstractC6536h) {
            a(abstractC6536h);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$TabStructureLayout$5$4$1", f = "MperksDashBoardActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$g, reason: case insensitive filesystem */
    static final class C12784g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114677a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<Integer> f114678b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f114679c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MperksDashBoardActivity f114680d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f114681e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f114682f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f114683g;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C12784g(this.f114678b, this.f114679c, this.f114680d, this.f114681e, this.f114682f, this.f114683g, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12784g(List<Integer> list, AbstractC16037C abstractC16037C, MperksDashBoardActivity mperksDashBoardActivity, boolean z10, int i10, InterfaceC5868j0 interfaceC5868j0, Continuation<? super C12784g> continuation) {
            super(2, continuation);
            this.f114678b = list;
            this.f114679c = abstractC16037C;
            this.f114680d = mperksDashBoardActivity;
            this.f114681e = z10;
            this.f114682f = i10;
            this.f114683g = interfaceC5868j0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12784g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i10;
            IntrinsicsKt.f();
            if (this.f114677a == 0) {
                ResultKt.b(obj);
                Integer num = (Integer) CollectionsKt.v0(this.f114678b, this.f114679c.v());
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (iIntValue == j0.f115067E1) {
                        this.f114680d.fsPage.updateProperties(MapsKt.g(TuplesKt.a("mPerks_tab", "Rewards")));
                    } else if (iIntValue == j0.f115140c0) {
                        InterfaceC5868j0 interfaceC5868j0 = this.f114683g;
                        if (this.f114681e) {
                            i10 = this.f114682f;
                        } else {
                            i10 = 0;
                        }
                        MperksDashBoardActivity.p2(interfaceC5868j0, i10);
                        this.f114680d.fsPage.updateProperties(MapsKt.g(TuplesKt.a("mPerks_tab", "Earn")));
                    } else if (iIntValue == j0.f115062D) {
                        this.f114680d.fsPage.updateProperties(MapsKt.g(TuplesKt.a("mPerks_tab", "Claim")));
                    }
                    return Unit.f143329a;
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$h, reason: case insensitive filesystem */
    static final class C12785h implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<Integer> f114684a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f114685b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f114686c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f114687d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f114688e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f114689f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ MperksDashBoardActivity f114690g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ RewardsViewState f114691h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$TabStructureLayout$5$5$1$1$1$1$1", f = "MperksDashBoardActivity.kt", l = {681}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$h$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f114692a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC16037C f114693b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f114694c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f114693b, this.f114694c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC16037C abstractC16037C, int i10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f114693b = abstractC16037C;
                this.f114694c = i10;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f114692a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    AbstractC16037C abstractC16037C = this.f114693b;
                    int i11 = this.f114694c;
                    this.f114692a = 1;
                    if (AbstractC16037C.n(abstractC16037C, i11, 0.0f, null, this, 6, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$h$b */
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f114695a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC16037C f114696b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f114697c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f114698d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ RewardsViewState f114699e;

            b(LocalThemeScope localThemeScope, AbstractC16037C abstractC16037C, int i10, int i11, RewardsViewState rewardsViewState) {
                this.f114695a = localThemeScope;
                this.f114696b = abstractC16037C;
                this.f114697c = i10;
                this.f114698d = i11;
                this.f114699e = rewardsViewState;
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
                LocalThemeScope localThemeScope = this.f114695a;
                q1.Label label = new q1.Label(null, this.f114696b.v() == this.f114697c ? this.f114695a.getAdsColors().getAdsColorText03() : this.f114695a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 349, null);
                if (this.f114698d == j0.f115067E1) {
                    composer.startReplaceGroup(1998997638);
                    if (this.f114699e.c().isEmpty()) {
                        composer.startReplaceGroup(1999373172);
                        strC = C16338g.c(j0.f115070F1, composer, 0);
                        composer.P();
                    } else {
                        composer.startReplaceGroup(1999073805);
                        strC = C16338g.d(this.f114698d, new Object[]{String.valueOf(this.f114699e.c().size())}, composer, 0);
                        composer.P();
                    }
                    composer.P();
                } else {
                    composer.startReplaceGroup(1449974818);
                    strC = C16338g.c(this.f114698d, composer, 0);
                    composer.P();
                }
                si.j.h(localThemeScope, label, strC, null, composer, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        C12785h(List<Integer> list, AbstractC16037C abstractC16037C, LocalThemeScope localThemeScope, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, MperksDashBoardActivity mperksDashBoardActivity, RewardsViewState rewardsViewState) {
            this.f114684a = list;
            this.f114685b = abstractC16037C;
            this.f114686c = localThemeScope;
            this.f114687d = function0;
            this.f114688e = function02;
            this.f114689f = function03;
            this.f114690g = mperksDashBoardActivity;
            this.f114691h = rewardsViewState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(int i10, Function0 function0, Function0 function02, Function0 function03, MperksDashBoardActivity mperksDashBoardActivity, AbstractC16037C abstractC16037C, int i11) {
            InterfaceC15783O interfaceC15783O;
            if (i10 == j0.f115067E1) {
                function0.invoke();
            } else if (i10 == j0.f115140c0) {
                function02.invoke();
            } else if (i10 == j0.f115062D) {
                function03.invoke();
            }
            InterfaceC15783O interfaceC15783O2 = mperksDashBoardActivity.coroutineScope;
            if (interfaceC15783O2 == null) {
                Intrinsics.x("coroutineScope");
                interfaceC15783O = null;
            } else {
                interfaceC15783O = interfaceC15783O2;
            }
            C15809k.d(interfaceC15783O, null, null, new a(abstractC16037C, i11, null), 3, null);
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            final AbstractC16037C abstractC16037C;
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
            List<Integer> list = this.f114684a;
            AbstractC16037C abstractC16037C2 = this.f114685b;
            LocalThemeScope localThemeScope = this.f114686c;
            Function0<Unit> function04 = this.f114687d;
            final Function0<Unit> function05 = this.f114688e;
            final Function0<Unit> function06 = this.f114689f;
            final MperksDashBoardActivity mperksDashBoardActivity2 = this.f114690g;
            RewardsViewState rewardsViewState = this.f114691h;
            final int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.w();
                }
                final int iIntValue = ((Number) obj).intValue();
                boolean z10 = i12 == abstractC16037C2.v();
                long color = localThemeScope.getAdsColors().getAdsColorText01().getColor();
                long color2 = localThemeScope.getAdsColors().getAdsColorActive01().getColor();
                Modifier modifierD = androidx.compose.foundation.b.d(Modifier.INSTANCE, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null);
                composer2.startReplaceGroup(-1224400529);
                boolean zD = composer2.d(iIntValue) | composer2.V(function04) | composer2.V(function05) | composer2.V(function06) | composer2.D(mperksDashBoardActivity2) | composer2.V(abstractC16037C2) | composer2.d(i12);
                Object objB = composer2.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    abstractC16037C = abstractC16037C2;
                    final Function0<Unit> function07 = function04;
                    Function0 function08 = new Function0() { // from class: com.meijer.mobile.mperks.ux.M
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MperksDashBoardActivity.C12785h.c(iIntValue, function07, function05, function06, mperksDashBoardActivity2, abstractC16037C, i12);
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
                    abstractC16037C = abstractC16037C2;
                    function02 = function05;
                    function03 = function06;
                    mperksDashBoardActivity = mperksDashBoardActivity2;
                    i11 = i12;
                }
                composer2.P();
                AbstractC16037C abstractC16037C3 = abstractC16037C;
                LocalThemeScope localThemeScope2 = localThemeScope;
                RewardsViewState rewardsViewState2 = rewardsViewState;
                A1.b(z10, (Function0) objB, modifierD, false, ComposableLambdaKt.c(1900948008, true, new b(localThemeScope2, abstractC16037C3, i11, iIntValue, rewardsViewState2), composer2, 54), null, null, color2, color, composer2, 24576, 104);
                composer2 = composer;
                i12 = i13;
                function04 = function0;
                function05 = function02;
                function06 = function03;
                mperksDashBoardActivity2 = mperksDashBoardActivity;
                abstractC16037C2 = abstractC16037C3;
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
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class i {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC6532d.values().length];
            try {
                iArr[EnumC6532d.f62699a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6532d.f62700b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6532d.f62701c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6532d.f62702d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC6532d.f62703e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class j implements InterfaceC14275b, FunctionAdapter {
        j() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            MperksDashBoardActivity.this.r3(p02);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$handleTabSelectedState$1", f = "MperksDashBoardActivity.kt", l = {1074}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114701a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Integer> f114703c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(List<Integer> list, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f114703c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MperksDashBoardActivity.this.new k(this.f114703c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114701a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC16037C abstractC16037C = MperksDashBoardActivity.this.pagerState;
                if (abstractC16037C == null) {
                    Intrinsics.x("pagerState");
                    abstractC16037C = null;
                }
                AbstractC16037C abstractC16037C2 = abstractC16037C;
                int iIndexOf = this.f114703c.indexOf(Boxing.d(j0.f115067E1));
                this.f114701a = 1;
                if (AbstractC16037C.n(abstractC16037C2, iIndexOf, 0.0f, null, this, 6, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$handleTabSelectedState$2", f = "MperksDashBoardActivity.kt", l = {1083}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114704a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Integer> f114706c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(List<Integer> list, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f114706c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MperksDashBoardActivity.this.new l(this.f114706c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114704a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC16037C abstractC16037C = MperksDashBoardActivity.this.pagerState;
                if (abstractC16037C == null) {
                    Intrinsics.x("pagerState");
                    abstractC16037C = null;
                }
                AbstractC16037C abstractC16037C2 = abstractC16037C;
                int iIndexOf = this.f114706c.indexOf(Boxing.d(j0.f115140c0));
                this.f114704a = 1;
                if (AbstractC16037C.n(abstractC16037C2, iIndexOf, 0.0f, null, this, 6, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$handleTabSelectedState$3", f = "MperksDashBoardActivity.kt", l = {1092}, m = "invokeSuspend")
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114707a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Integer> f114709c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(List<Integer> list, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f114709c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MperksDashBoardActivity.this.new m(this.f114709c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114707a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC16037C abstractC16037C = MperksDashBoardActivity.this.pagerState;
                if (abstractC16037C == null) {
                    Intrinsics.x("pagerState");
                    abstractC16037C = null;
                }
                AbstractC16037C abstractC16037C2 = abstractC16037C;
                int iIndexOf = this.f114709c.indexOf(Boxing.d(j0.f115062D));
                this.f114707a = 1;
                if (AbstractC16037C.n(abstractC16037C2, iIndexOf, 0.0f, null, this, 6, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<Integer> f114711b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MperksDashBoardActivity f114712a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<Integer> f114713b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$n$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C1810a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AbstractC6165l.a.values().length];
                    try {
                        iArr[AbstractC6165l.a.ON_RESUME.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            a(MperksDashBoardActivity mperksDashBoardActivity, List<Integer> list) {
                this.f114712a = mperksDashBoardActivity;
                this.f114713b = list;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit q(MperksDashBoardActivity mperksDashBoardActivity, List list, InterfaceC6172s interfaceC6172s, AbstractC6165l.a event) {
                Intrinsics.j(interfaceC6172s, "<unused var>");
                Intrinsics.j(event, "event");
                if (C1810a.$EnumSwitchMapping$0[event.ordinal()] == 1) {
                    mperksDashBoardActivity.t3(list);
                }
                return Unit.f143329a;
            }

            public final void e(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                InterfaceC15783O interfaceC15783O;
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
                this.f114712a.p3().k(165);
                z1 z1VarC = S2.a.c(this.f114712a.o3().u(), null, null, null, composer, 0, 7);
                z1 z1VarC2 = S2.a.c(this.f114712a.o3().v(), null, null, null, composer, 0, 7);
                C17998e0 c17998e0J = C17995d0.j(EnumC18001f0.f168977a, null, composer, 6, 2);
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = new C18029o1();
                    composer.t(objB);
                }
                C18029o1 c18029o1 = (C18029o1) objB;
                composer.P();
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == companion.a()) {
                    objB2 = new C17993c1(c17998e0J, c18029o1);
                    composer.t(objB2);
                }
                C17993c1 c17993c1 = (C17993c1) objB2;
                composer.P();
                final z1 z1VarC3 = S2.a.c(this.f114712a.m3().B(), null, null, null, composer, 0, 7);
                MperksDashBoardActivity mperksDashBoardActivity = this.f114712a;
                int iIndexOf = this.f114713b.indexOf(Integer.valueOf(j0.f115062D));
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f114713b);
                final List<Integer> list = this.f114713b;
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
                mperksDashBoardActivity.pagerState = C16038D.k(iIndexOf, 0.0f, (Function0) objB3, composer, 0, 2);
                MperksDashBoardActivity mperksDashBoardActivity2 = this.f114712a;
                Object objB4 = composer.B();
                if (objB4 == companion.a()) {
                    objB4 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                    composer.t(objB4);
                }
                mperksDashBoardActivity2.coroutineScope = (InterfaceC15783O) objB4;
                C16521g c16521gP3 = this.f114712a.p3();
                InterfaceC15783O interfaceC15783O2 = this.f114712a.coroutineScope;
                if (interfaceC15783O2 == null) {
                    Intrinsics.x("coroutineScope");
                    interfaceC15783O = null;
                } else {
                    interfaceC15783O = interfaceC15783O2;
                }
                C16507K.b(c16521gP3, c17998e0J, interfaceC15783O, composer, C16521g.f157265l);
                MperksDashBoardActivity mperksDashBoardActivity3 = this.f114712a;
                composer.startReplaceGroup(-1633490746);
                boolean zD2 = composer.D(this.f114712a) | composer.D(this.f114713b);
                final MperksDashBoardActivity mperksDashBoardActivity4 = this.f114712a;
                final List<Integer> list2 = this.f114713b;
                Object objB5 = composer.B();
                if (zD2 || objB5 == companion.a()) {
                    objB5 = new Function2() { // from class: com.meijer.mobile.mperks.ux.O
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MperksDashBoardActivity.n.a.q(mperksDashBoardActivity4, list2, (InterfaceC6172s) obj, (AbstractC6165l.a) obj2);
                        }
                    };
                    composer.t(objB5);
                }
                composer.P();
                mperksDashBoardActivity3.d2((Function2) objB5, composer, 0);
                if (o(z1VarC3).getShouldShowWalkThru()) {
                    composer.startReplaceGroup(-870930652);
                    composer.startReplaceGroup(5004770);
                    boolean zD3 = composer.D(this.f114712a);
                    final MperksDashBoardActivity mperksDashBoardActivity5 = this.f114712a;
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
                    boolean zV = composer.V(z1VarC3) | composer.D(this.f114712a);
                    final MperksDashBoardActivity mperksDashBoardActivity6 = this.f114712a;
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
                    ns.q.l(AdsTheme, null, function0, (Function1) objB7, composer, LocalThemeScope.f17314g | (i11 & 14), 1);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-870151715);
                    this.f114712a.S1(AdsTheme, c17993c1, f(z1VarC), g(z1VarC2), o(z1VarC3), this.f114713b, null, composer, LocalThemeScope.f17314g | 48 | (i11 & 14) | (HeaderDecorator.f157113i << 6) | (DrawerLayoutDecorator.f157377h << 9), 32);
                    composer.P();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                e(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
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
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(MperksDashBoardActivity mperksDashBoardActivity, z1 z1Var, int i10) {
                if (o(z1Var).getIsPointsBalanceUpdated()) {
                    String pointsBalance = o(z1Var).getPointsBalance();
                    String string = mperksDashBoardActivity.getString(i10);
                    Intrinsics.i(string, "getString(...)");
                    mperksDashBoardActivity.T3(pointsBalance, string);
                }
                return Unit.f143329a;
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
            this.f114711b = list;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1833939348, i10, -1, "com.meijer.mobile.mperks.ux.MperksDashBoardActivity.onCreate.<anonymous> (MperksDashBoardActivity.kt:287)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(110837413, true, new a(MperksDashBoardActivity.this, this.f114711b), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$onCreate$2", f = "MperksDashBoardActivity.kt", l = {347}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114714a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$onCreate$2$1", f = "MperksDashBoardActivity.kt", l = {348}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f114716a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MperksDashBoardActivity f114717b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MperksDashBoardActivity mperksDashBoardActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f114717b = mperksDashBoardActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f114717b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$b;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/mperks/ux/V$b;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$onCreate$2$1$1", f = "MperksDashBoardActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.mperks.ux.MperksDashBoardActivity$o$a$a, reason: collision with other inner class name */
            static final class C1811a extends SuspendLambda implements Function2<V.b, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f114718a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f114719b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ MperksDashBoardActivity f114720c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1811a(MperksDashBoardActivity mperksDashBoardActivity, Continuation<? super C1811a> continuation) {
                    super(2, continuation);
                    this.f114720c = mperksDashBoardActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1811a c1811a = new C1811a(this.f114720c, continuation);
                    c1811a.f114719b = obj;
                    return c1811a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(V.b bVar, Continuation<? super Unit> continuation) {
                    return ((C1811a) create(bVar, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f114718a == 0) {
                        ResultKt.b(obj);
                        this.f114720c.s3((V.b) this.f114719b);
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f114716a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16553F<V.b> events = this.f114717b.m3().getEvents();
                    C1811a c1811a = new C1811a(this.f114717b, null);
                    this.f114716a = 1;
                    if (C16563h.k(events, c1811a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
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
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114714a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                MperksDashBoardActivity mperksDashBoardActivity = MperksDashBoardActivity.this;
                AbstractC6165l.b bVar = AbstractC6165l.b.f55501c;
                a aVar = new a(mperksDashBoardActivity, null);
                this.f114714a = 1;
                if (C6136J.b(mperksDashBoardActivity, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$onEvent$1", f = "MperksDashBoardActivity.kt", l = {1109, 1109}, m = "invokeSuspend")
    static final class p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114721a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f114722b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MperksDashBoardActivity f114723c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC15305c f114724d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new p(this.f114722b, this.f114723c, this.f114724d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(LocalThemeScope localThemeScope, MperksDashBoardActivity mperksDashBoardActivity, AbstractC15305c abstractC15305c, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f114722b = localThemeScope;
            this.f114723c = mperksDashBoardActivity;
            this.f114724d = abstractC15305c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
        
            if (Hi.i.i((Hi.i) r0, r2, null, r3, false, r5, null, null, null, r13, 226, null) == r12) goto L15;
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
                int r0 = r13.f114721a
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
                Ki.M r0 = r13.f114722b
                r13.f114721a = r2
                r3 = 0
                r4 = 0
                java.lang.Object r0 = Ki.LocalThemeScope.g(r0, r3, r13, r2, r4)
                if (r0 != r12) goto L2f
                goto L5a
            L2f:
                Hi.i r0 = (Hi.i) r0
                com.meijer.mobile.mperks.ux.MperksDashBoardActivity r2 = r13.f114723c
                ko.c r3 = r13.f114724d
                ko.c$d r3 = (ko.AbstractC15305c.ShowErrorToast) r3
                int r3 = r3.getMessageResId()
                java.lang.String r2 = r2.getString(r3)
                java.lang.String r3 = "getString(...)"
                kotlin.jvm.internal.Intrinsics.i(r2, r3)
                Hi.e r3 = Hi.e.f13557b
                ki.q1$m$a$b r5 = ki.q1.m.a.b.f142368a
                r13.f114721a = r1
                r1 = r2
                r2 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 226(0xe2, float:3.17E-43)
                r11 = 0
                r9 = r13
                java.lang.Object r0 = Hi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L5b
            L5a:
                return r12
            L5b:
                kotlin.Unit r0 = kotlin.Unit.f143329a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.MperksDashBoardActivity.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$onEvent$2", f = "MperksDashBoardActivity.kt", l = {1124, 1124}, m = "invokeSuspend")
    static final class q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114725a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f114726b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MperksDashBoardActivity f114727c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new q(this.f114726b, this.f114727c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(LocalThemeScope localThemeScope, MperksDashBoardActivity mperksDashBoardActivity, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f114726b = localThemeScope;
            this.f114727c = mperksDashBoardActivity;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (Hi.i.i((Hi.i) r0, r2, null, r3, false, r5, null, null, null, r13, 224, null) == r12) goto L15;
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
                int r0 = r13.f114725a
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
                Ki.M r0 = r13.f114726b
                r13.f114725a = r2
                r3 = 0
                r4 = 0
                java.lang.Object r0 = Ki.LocalThemeScope.g(r0, r3, r13, r2, r4)
                if (r0 != r12) goto L2f
                goto L54
            L2f:
                Hi.i r0 = (Hi.i) r0
                com.meijer.mobile.mperks.ux.MperksDashBoardActivity r2 = r13.f114727c
                int r3 = com.meijer.mobile.mperks.ux.j0.f115058B1
                java.lang.String r2 = r2.getString(r3)
                java.lang.String r3 = "getString(...)"
                kotlin.jvm.internal.Intrinsics.i(r2, r3)
                Hi.e r3 = Hi.e.f13557b
                ki.q1$m$a$d r5 = ki.q1.m.a.d.f142372a
                r13.f114725a = r1
                r1 = r2
                r2 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 224(0xe0, float:3.14E-43)
                r11 = 0
                r9 = r13
                java.lang.Object r0 = Hi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L55
            L54:
                return r12
            L55:
                kotlin.Unit r0 = kotlin.Unit.f143329a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.MperksDashBoardActivity.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$onNavigationRequest$1", f = "MperksDashBoardActivity.kt", l = {androidx.room.G.MAX_BIND_PARAMETER_CNT}, m = "invokeSuspend")
    static final class r extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114728a;

        r(Continuation<? super r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MperksDashBoardActivity.this.new r(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114728a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC16037C abstractC16037C = MperksDashBoardActivity.this.pagerState;
                if (abstractC16037C == null) {
                    Intrinsics.x("pagerState");
                    abstractC16037C = null;
                }
                this.f114728a = 1;
                if (AbstractC16037C.d0(abstractC16037C, 1, 0.0f, this, 2, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardActivity$onNavigationRequest$2", f = "MperksDashBoardActivity.kt", l = {1006}, m = "invokeSuspend")
    static final class s extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114730a;

        s(Continuation<? super s> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MperksDashBoardActivity.this.new s(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114730a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC16037C abstractC16037C = MperksDashBoardActivity.this.pagerState;
                if (abstractC16037C == null) {
                    Intrinsics.x("pagerState");
                    abstractC16037C = null;
                }
                this.f114730a = 1;
                if (AbstractC16037C.d0(abstractC16037C, 2, 0.0f, this, 2, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class t extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114732f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentActivity componentActivity) {
            super(0);
            this.f114732f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f114732f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class u extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114733f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentActivity componentActivity) {
            super(0);
            this.f114733f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f114733f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class v extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f114734f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114735g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f114734f = function0;
            this.f114735g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f114734f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f114735g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class w extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114736f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentActivity componentActivity) {
            super(0);
            this.f114736f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f114736f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class x extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114737f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ComponentActivity componentActivity) {
            super(0);
            this.f114737f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f114737f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class y extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f114738f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114739g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f114738f = function0;
            this.f114739g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f114738f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f114739g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class z extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f114740f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ComponentActivity componentActivity) {
            super(0);
            this.f114740f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f114740f.getDefaultViewModelProviderFactory();
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
    private final void b2(final Ki.LocalThemeScope r34, final kotlin.AbstractC16037C r35, final java.util.List<java.lang.Integer> r36, final int r37, final boolean r38, final qo.RewardsViewState r39, final ko.ClaimTabState r40, final int r41, final co.EnumC6532d r42, androidx.compose.ui.Modifier r43, final kotlin.jvm.functions.Function1<? super co.EnumC6532d, kotlin.Unit> r44, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r45, final oo.EarnInProgressState r46, final kotlin.jvm.functions.Function0<kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.MperksDashBoardActivity.b2(Ki.M, o0.C, java.util.List, int, boolean, qo.M, ko.d, int, co.d, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, oo.v, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g2(MperksDashBoardActivity mperksDashBoardActivity, Function2 function2, int i10, Composer composer, int i11) {
        mperksDashBoardActivity.d2(function2, composer, J0.a(i10 | 1));
        return Unit.f143329a;
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
    public final void h2(final Ki.LocalThemeScope r45, final int r46, final java.util.List<java.lang.Integer> r47, final boolean r48, final kotlin.AbstractC16037C r49, final ko.ClaimTabState r50, final qo.RewardsViewState r51, final oo.EarnInProgressState r52, final com.meijer.mobile.mperks.ux.V.PointsBalanceViewState r53, final boolean r54, final boolean r55, androidx.compose.ui.Modifier r56, final kotlin.jvm.functions.Function0<kotlin.Unit> r57, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r58, final kotlin.jvm.functions.Function0<kotlin.Unit> r59, kotlin.jvm.functions.Function0<kotlin.Unit> r60, kotlin.jvm.functions.Function0<kotlin.Unit> r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r63, androidx.compose.runtime.Composer r64, final int r65, final int r66, final int r67) {
        /*
            Method dump skipped, instructions count: 1814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.MperksDashBoardActivity.h2(Ki.M, int, java.util.List, boolean, o0.C, ko.d, qo.M, oo.v, com.meijer.mobile.mperks.ux.V$c, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C3(LocalThemeScope localThemeScope, AbstractC15305c abstractC15305c, InterfaceC15783O interfaceC15783O) {
        if (abstractC15305c instanceof AbstractC15305c.ShowErrorToast) {
            C15809k.d(interfaceC15783O, null, null, new p(localThemeScope, this, abstractC15305c, null), 3, null);
            return;
        }
        if (abstractC15305c instanceof AbstractC15305c.b) {
            setResult(HomeFragment.MPERKS_REWARDS_UPDATED_RESULT_CODE);
            return;
        }
        if (abstractC15305c instanceof AbstractC15305c.ShowClaimSuccessToast) {
            C15809k.d(interfaceC15783O, null, null, new q(localThemeScope, this, null), 3, null);
            Q3(((AbstractC15305c.ShowClaimSuccessToast) abstractC15305c).getCoupon());
        } else {
            if (!(abstractC15305c instanceof AbstractC15305c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            m3().D(V.a.g.f114772a);
            m3().D(V.a.h.f114773a);
            q3().s(AbstractC16740o.c.f158878a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D3(AbstractC6536h navigationRequest) {
        InterfaceC15783O interfaceC15783O;
        InterfaceC15783O interfaceC15783O2;
        if (navigationRequest instanceof AbstractC6536h.i) {
            this.isEarnTabAnalyticsSent = false;
            InterfaceC15783O interfaceC15783O3 = this.coroutineScope;
            if (interfaceC15783O3 == null) {
                Intrinsics.x("coroutineScope");
                interfaceC15783O2 = null;
            } else {
                interfaceC15783O2 = interfaceC15783O3;
            }
            C15809k.d(interfaceC15783O2, null, null, new r(null), 3, null);
            return;
        }
        if (navigationRequest instanceof AbstractC6536h.C1234h) {
            this.isClaimTabAnalyticsSent = false;
            InterfaceC15783O interfaceC15783O4 = this.coroutineScope;
            if (interfaceC15783O4 == null) {
                Intrinsics.x("coroutineScope");
                interfaceC15783O = null;
            } else {
                interfaceC15783O = interfaceC15783O4;
            }
            C15809k.d(interfaceC15783O, null, null, new s(null), 3, null);
            return;
        }
        if (navigationRequest instanceof AbstractC6536h.OnClippedRewardCardClicked) {
            E3(((AbstractC6536h.OnClippedRewardCardClicked) navigationRequest).getClippedReward());
            return;
        }
        if (navigationRequest instanceof AbstractC6536h.OnViewAllRewardsClicked) {
            m3().D(new V.a.ViewAllRewardsClicked(((AbstractC6536h.OnViewAllRewardsClicked) navigationRequest).a()));
            return;
        }
        if (navigationRequest instanceof AbstractC6536h.CreditCardViewClickedOnInProgressPill) {
            m3().D(new V.a.CreditCardViewClickedOnInProgressPill(((AbstractC6536h.CreditCardViewClickedOnInProgressPill) navigationRequest).getMccProgram()));
            return;
        }
        if (navigationRequest instanceof AbstractC6536h.a) {
            m3().D(V.a.b.f114767a);
            return;
        }
        if (navigationRequest instanceof AbstractC6536h.OnClaimRewardCardClicked) {
            A3(((AbstractC6536h.OnClaimRewardCardClicked) navigationRequest).getClaimReward());
            return;
        }
        if (navigationRequest instanceof AbstractC6536h.OnAutoClaimRewardCardClicked) {
            l3().D();
            m3().D(new V.a.AutoEnrollDescriptionClicked(((AbstractC6536h.OnAutoClaimRewardCardClicked) navigationRequest).getAutoClaimReward()));
        } else if (navigationRequest instanceof AbstractC6536h.m) {
            m3().D(V.a.j.f114775a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H3(AutoClaimReward autoClaimReward, MperksDashBoardActivity mperksDashBoardActivity, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Claim");
        track.h("rewardID", autoClaimReward.getTitle());
        track.h("autoClaimType", autoClaimReward.getAutoClaimType().getValue());
        track.h("autoClaimAmount", String.valueOf(autoClaimReward.getAutoClaimAmount()));
        track.h("mperksPoints", String.valueOf(mperksDashBoardActivity.mperksPointBalance));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J3(AutoClaimReward autoClaimReward, String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Claim");
        track.h("rewardID", autoClaimReward.getTitle());
        track.h("mperksPoints", str);
        track.h("autoClaimType", autoClaimReward.getAutoClaimType().getValue());
        track.h("autoClaimAmount", String.valueOf(autoClaimReward.getAutoClaimAmount()));
        return Unit.f143329a;
    }

    private final void K3(EnumC6532d selectedClaimSubPill, final int pointBalance) {
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
        o1().b(C14756c.a(str), new Function1() { // from class: com.meijer.mobile.mperks.ux.h
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M3(int pointBalance, List<String> claimRewards) {
        if (this.isClaimTabAnalyticsSent) {
            return;
        }
        this.previousTrackAction = u3() ? "Learn More: Redeem Rewards" : "Claim Tab";
        l3().E(new AbstractC15303a.TrackClaimTabSelected(pointBalance, claimRewards, this.previousTrackAction));
        this.isClaimTabAnalyticsSent = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O3(String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.h("mperksPoints", str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P3(int pointsBalance, String rewardsInProgressList, String rewardsAvailableList, EnumC6534f tab) {
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
        zVarL3.E(new AbstractC15303a.TrackRewardClaimedAction(str, strG, String.valueOf(claimReward != null ? Long.valueOf(claimReward.d()) : null), "mPerks Claim page", pointCost, this.mperksPointBalance - pointCost));
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
    public final void S1(final Ki.LocalThemeScope r34, final kotlin.C17993c1 r35, final ps.HeaderDecorator r36, final ps.DrawerLayoutDecorator r37, final com.meijer.mobile.mperks.ux.V.PointsBalanceViewState r38, final java.util.List<java.lang.Integer> r39, androidx.compose.ui.Modifier r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.MperksDashBoardActivity.S1(Ki.M, x0.c1, ps.F, ps.t, com.meijer.mobile.mperks.ux.V$c, java.util.List, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S3(String str, String str2, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Earn");
        track.n("mPerks:Reward Details Page");
        track.h("mperksPoints", str);
        track.h("rewardID", str2);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U3(String str, MperksDashBoardActivity mperksDashBoardActivity, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Walkthrough");
        track.h("mperksPoints", str);
        if (mperksDashBoardActivity.isWalkThruTriggered) {
            track.p(mperksDashBoardActivity.getString(j0.f115091M1));
            mperksDashBoardActivity.isWalkThruTriggered = false;
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V1(MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope, C17993c1 c17993c1, HeaderDecorator headerDecorator, DrawerLayoutDecorator drawerLayoutDecorator, V.PointsBalanceViewState pointsBalanceViewState, List list, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        mperksDashBoardActivity.S1(localThemeScope, c17993c1, headerDecorator, drawerLayoutDecorator, pointsBalanceViewState, list, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c2(MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope, AbstractC16037C abstractC16037C, List list, int i10, boolean z10, RewardsViewState rewardsViewState, ClaimTabState claimTabState, int i11, EnumC6532d enumC6532d, Modifier modifier, Function1 function1, Function1 function12, EarnInProgressState earnInProgressState, Function0 function0, int i12, int i13, int i14, Composer composer, int i15) {
        mperksDashBoardActivity.b2(localThemeScope, abstractC16037C, list, i10, z10, rewardsViewState, claimTabState, i11, enumC6532d, modifier, function1, function12, earnInProgressState, function0, composer, J0.a(i12 | 1), J0.a(i13), i14);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.E e2(z1 z1Var, final z1 z1Var2, androidx.compose.runtime.F DisposableEffect) {
        Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
        AbstractC6165l lifecycle = ((InterfaceC6172s) z1Var.getValue()).getLifecycle();
        InterfaceC6169p interfaceC6169p = new InterfaceC6169p() { // from class: com.meijer.mobile.mperks.ux.r
            @Override // androidx.view.InterfaceC6169p
            public final void onStateChanged(InterfaceC6172s interfaceC6172s, AbstractC6165l.a aVar) {
                MperksDashBoardActivity.f2(z1Var2, interfaceC6172s, aVar);
            }
        };
        lifecycle.a(interfaceC6169p);
        return new C12782e(lifecycle, interfaceC6169p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f2(z1 z1Var, InterfaceC6172s owner, AbstractC6165l.a event) {
        Intrinsics.j(owner, "owner");
        Intrinsics.j(event, "event");
        ((Function2) z1Var.getValue()).invoke(owner, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i2() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j2() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k2() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l2(float f10) {
        return Unit.f143329a;
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
    public final C16508L o3() {
        return (C16508L) this.navigationDrawerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16521g p3() {
        return (C16521g) this.navigationHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16717I q3() {
        return (C16717I) this.rewardsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s2(MperksDashBoardActivity mperksDashBoardActivity, InterfaceC5872l0 interfaceC5872l0, EnumC6532d pill) {
        Intrinsics.j(pill, "pill");
        r2(interfaceC5872l0, pill);
        mperksDashBoardActivity.K3(q2(interfaceC5872l0), mperksDashBoardActivity.mperksPointBalance);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s3(V.b event) {
        if (event instanceof V.b.h) {
            startActivity(Bl.d.a(this, true, this.mperksPointBalance));
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
            startActivity(f0.f114968a.d(this));
            return;
        }
        if (event instanceof V.b.CreditCardViewInProgress) {
            startActivity(f0.f114968a.c(this, ((V.b.CreditCardViewInProgress) event).getMccProgram()));
            return;
        }
        if (event instanceof V.b.NavigateToAutoEnrollInfoPage) {
            V.b.NavigateToAutoEnrollInfoPage navigateToAutoEnrollInfoPage = (V.b.NavigateToAutoEnrollInfoPage) event;
            this.autoClaimDetailActivityLauncher.a(f0.f114968a.a(this, navigateToAutoEnrollInfoPage.getAutoClaimReward()));
            I3(String.valueOf(this.mperksPointBalance), navigateToAutoEnrollInfoPage.getAutoClaimReward());
        } else if (event instanceof V.b.NavigateToDescriptionPage) {
            V.b.NavigateToDescriptionPage navigateToDescriptionPage = (V.b.NavigateToDescriptionPage) event;
            startActivity(f0.f114968a.e(this, navigateToDescriptionPage.getCoupon(), navigateToDescriptionPage.getNavigatedFrom(), navigateToDescriptionPage.getIsShoppableReward()));
        } else if (event instanceof V.b.NavigateToViewAllRewards) {
            startActivity(f0.f114968a.f(this, ((V.b.NavigateToViewAllRewards) event).a(), String.valueOf(this.mperksPointBalance)));
        } else {
            if (!(event instanceof V.b.e)) {
                throw new NoWhenBranchMatchedException();
            }
            startActivity(r1().d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u2(MperksDashBoardActivity mperksDashBoardActivity, LocalThemeScope localThemeScope, int i10, List list, boolean z10, AbstractC16037C abstractC16037C, ClaimTabState claimTabState, RewardsViewState rewardsViewState, EarnInProgressState earnInProgressState, V.PointsBalanceViewState pointsBalanceViewState, boolean z11, boolean z12, Modifier modifier, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function12, int i11, int i12, int i13, Composer composer, int i14) {
        mperksDashBoardActivity.h2(localThemeScope, i10, list, z10, abstractC16037C, claimTabState, rewardsViewState, earnInProgressState, pointsBalanceViewState, z11, z12, modifier, function0, function1, function02, function03, function04, function05, function12, composer, J0.a(i11 | 1), J0.a(i12), i13);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16521g z3(MperksDashBoardActivity mperksDashBoardActivity) {
        return new C16521g(mperksDashBoardActivity);
    }

    public final void d2(final Function2<? super InterfaceC6172s, ? super AbstractC6165l.a, Unit> onEvent, Composer composer, final int i10) {
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
                    return MperksDashBoardActivity.g2(this.f115243a, onEvent, i10, (Composer) obj, ((Integer) obj2).intValue());
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
        Hi.i.INSTANCE.b();
        super.onPause();
    }

    private final void A3(ClaimReward claimReward) {
        int i10;
        ko.z zVarL3 = l3();
        String str = claimReward.getCouponId() + ": " + claimReward.getName();
        String strG = claimReward.g();
        if (strG == null) {
            strG = getString(j0.f115055A1);
            Intrinsics.i(strG, "getString(...)");
        }
        String strValueOf = String.valueOf(claimReward.d());
        if (ClaimReward.o(claimReward, null, 1, null)) {
            i10 = j0.f115225z1;
        } else {
            i10 = j0.f115219x1;
        }
        String string = getString(i10);
        Intrinsics.i(string, "getString(...)");
        zVarL3.E(new AbstractC15303a.TrackClaimRewardCardClicked(str, strG, strValueOf, string, this.mperksPointBalance));
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
        C16717I c16717iQ3 = q3();
        String str2 = clippedReward.getRewardId() + ": " + clippedReward.getName();
        ZonedDateTime endDate = clippedReward.getEndDate();
        if (endDate != null) {
            str = endDate.format(C17898a.DATE_FORMAT_MM_DD_YYYY);
        } else {
            str = null;
        }
        c16717iQ3.s(new AbstractC16740o.AnalyticsRewardDetailsPage(str2, str, String.valueOf(clippedReward.getDaysLeft()), String.valueOf(this.mperksPointBalance), "Learn More: View Rewards"));
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
        q3().s(new AbstractC16740o.AnalyticsRewardsAction(String.valueOf(pointBalance), availableRewards, this.previousTrackAction));
        this.isRewardsTabAnalyticsSent = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G3(String claimAction, final AutoClaimReward autoClaimReward) {
        o1().b(C14756c.a(claimAction), new Function1() { // from class: com.meijer.mobile.mperks.ux.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MperksDashBoardActivity.H3(autoClaimReward, this, (TrackingData) obj);
            }
        });
    }

    private final void I3(final String pointsBalance, final AutoClaimReward autoClaimReward) {
        o1().b(C14756c.h("mPerks:Auto Claim Details Page"), new Function1() { // from class: com.meijer.mobile.mperks.ux.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MperksDashBoardActivity.J3(autoClaimReward, pointsBalance, (TrackingData) obj);
            }
        });
    }

    private final void N3(final String pointsBalance) {
        o1().b(C14756c.a("mPerks:Walkthrough banner removed"), new Function1() { // from class: com.meijer.mobile.mperks.ux.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MperksDashBoardActivity.O3(pointsBalance, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R3(final String rewardId, final String pointsBalance) {
        o1().b(C14756c.a("mPerks Rewards:Shop Now"), new Function1() { // from class: com.meijer.mobile.mperks.ux.m
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
        o1().b(C14756c.h(state), new Function1() { // from class: com.meijer.mobile.mperks.ux.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MperksDashBoardActivity.U3(pointsBalance, this, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U1(InterfaceC5866i0 interfaceC5866i0, float f10) {
        interfaceC5866i0.A(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float W1(InterfaceC5866i0 interfaceC5866i0) {
        return interfaceC5866i0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X1(InterfaceC5866i0 interfaceC5866i0, float f10) {
        interfaceC5866i0.A(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Y1(InterfaceC5866i0 interfaceC5866i0) {
        return interfaceC5866i0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z1(InterfaceC5866i0 interfaceC5866i0, float f10) {
        interfaceC5866i0.A(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float a2(InterfaceC5866i0 interfaceC5866i0) {
        return interfaceC5866i0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m2(MperksDashBoardActivity mperksDashBoardActivity, Function1 function1) {
        mperksDashBoardActivity.p1().H(false);
        mperksDashBoardActivity.N3(String.valueOf(mperksDashBoardActivity.mperksPointBalance));
        function1.invoke(Boolean.FALSE);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n2(MperksDashBoardActivity mperksDashBoardActivity) {
        mperksDashBoardActivity.m3().D(new V.a.SeeWhatsNewAction(true));
        mperksDashBoardActivity.isWalkThruTriggered = true;
        return Unit.f143329a;
    }

    private static final int o2(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p2(InterfaceC5868j0 interfaceC5868j0, int i10) {
        interfaceC5868j0.i(i10);
    }

    private static final EnumC6532d q2(InterfaceC5872l0<EnumC6532d> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void r2(InterfaceC5872l0<EnumC6532d> interfaceC5872l0, EnumC6532d enumC6532d) {
        interfaceC5872l0.setValue(enumC6532d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r3(C14274a result) {
        if (result.getResultCode() == -1) {
            l3().x();
            m3().D(V.a.g.f114772a);
            m3().D(V.a.h.f114773a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t2(InterfaceC5868j0 interfaceC5868j0, int i10) {
        p2(interfaceC5868j0, i10);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t3(List<Integer> tabList) {
        InterfaceC15783O interfaceC15783O;
        InterfaceC15783O interfaceC15783O2;
        InterfaceC15783O interfaceC15783O3;
        if (y3()) {
            InterfaceC15783O interfaceC15783O4 = this.coroutineScope;
            if (interfaceC15783O4 == null) {
                Intrinsics.x("coroutineScope");
                interfaceC15783O3 = null;
            } else {
                interfaceC15783O3 = interfaceC15783O4;
            }
            C15809k.d(interfaceC15783O3, null, null, new k(tabList, null), 3, null);
            if (u3()) {
                this.previousTrackAction = "Learn More: View Rewards";
                this.isRewardsTabAnalyticsSent = false;
                return;
            }
            return;
        }
        if (x3()) {
            InterfaceC15783O interfaceC15783O5 = this.coroutineScope;
            if (interfaceC15783O5 == null) {
                Intrinsics.x("coroutineScope");
                interfaceC15783O2 = null;
            } else {
                interfaceC15783O2 = interfaceC15783O5;
            }
            C15809k.d(interfaceC15783O2, null, null, new l(tabList, null), 3, null);
            if (u3()) {
                this.previousTrackAction = "Learn More: Start Earning";
                this.isEarnTabAnalyticsSent = false;
                return;
            }
            return;
        }
        if (w3()) {
            InterfaceC15783O interfaceC15783O6 = this.coroutineScope;
            if (interfaceC15783O6 == null) {
                Intrinsics.x("coroutineScope");
                interfaceC15783O = null;
            } else {
                interfaceC15783O = interfaceC15783O6;
            }
            C15809k.d(interfaceC15783O, null, null, new m(tabList, null), 3, null);
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
        m3().D(V.a.g.f114772a);
        m3().D(V.a.f.f114771a);
        m3().D(V.a.h.f114773a);
        if (s1().e(AbstractC18503f.C.f172844h)) {
            n3().w(e0.a.f155210a);
        }
        this.earnTabIndex = v3() ? 1 : 0;
        o3().w(165);
        if (s1().e(AbstractC18503f.I.f172848h)) {
            listP = CollectionsKt.p(Integer.valueOf(j0.f115062D), Integer.valueOf(j0.f115140c0));
        } else {
            listP = CollectionsKt.p(Integer.valueOf(j0.f115067E1), Integer.valueOf(j0.f115140c0), Integer.valueOf(j0.f115062D));
        }
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1833939348, true, new n(listP)), 1, null);
        C15809k.d(C6173t.a(this), null, null, new o(null), 3, null);
    }

    @Override // com.meijer.mobile.mperks.ux.MperksFeatureActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.fsPage.start();
    }
}
