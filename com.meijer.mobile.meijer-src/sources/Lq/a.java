package Lq;

import Kq.Classroom;
import Kq.School;
import Kq.Supplies;
import Mq.TeacherListsClassroomsRequest;
import Mq.TeacherListsSchoolsRequest;
import Mq.TeacherListsSuppliesRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH¦@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"LLq/a;", "", "LMq/b;", "request", "", "LKq/b;", "c", "(LMq/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LMq/a;", "LKq/a;", "b", "(LMq/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LMq/c;", "LKq/c;", "a", "(LMq/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {
    Object a(TeacherListsSuppliesRequest teacherListsSuppliesRequest, Continuation<? super Supplies> continuation);

    Object b(TeacherListsClassroomsRequest teacherListsClassroomsRequest, Continuation<? super List<Classroom>> continuation);

    Object c(TeacherListsSchoolsRequest teacherListsSchoolsRequest, Continuation<? super List<School>> continuation);
}
