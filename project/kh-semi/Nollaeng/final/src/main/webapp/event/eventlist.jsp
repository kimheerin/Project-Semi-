<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�̺�Ʈ ���</title>
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;700&display=swap"
	rel="stylesheet">
<style>
body {
   font-family: '���� ����', 'Malgun Gothic', Arial, sans-serif;
   margin: 0;
   padding: 0;
   background-color: #f4f4f4;
}

header {
   background-color: #333;
   color: #fff;
   text-align: center;
   padding: 1em;
}

main {
   margin: 20px;
}

.event {
   border: 1px solid #ddd;
   background-color: #fff;
   margin-bottom: 20px;
   padding: 15px;
   border-radius: 5px;
   display: flex;
   flex-direction: row;
}

h2 {
   margin-top: 20px;
   color: #333;
}

.event-text {
   margin-left: 30px;
   flex: 1;
}

p {
   margin-top: 10px;
   color: #666;
}

.event img {
   width: 200px;
   height: 130px;
   border-radius: 5px;
   margin-bottom: 10px;
}

a {
   
   color: #007BFF;
   text-decoration: none;
   font-weight: bold;
}

a:hover {
   text-decoration: underline;
}
</style>
</head>
<body>
   <jsp:include page="../header.jsp" />

   <header>
      <h1>�̺�Ʈ ���</h1>
   </header>

   <main>
      <div class="event">
         <a href="../event/event_page3.jsp"><img src="../resources/images/�ܿＶmini.png" alt="�̺�Ʈ 1 �̹���"></a>
         <div class="event-text">
            <a href="../event/event_page3.jsp"><h2>2023 ã�ư��� ���� �ܿ�X�� ������ �̺�Ʈ</h2></a>
            <p>2023. 12. 1.~2024. 2. 4.</p>
         </div>
      </div>
      <div class="event">
         <a href="../event/event_page2.jsp"><img src="../resources/images/��ŷ��.png" alt="�̺�Ʈ 2 �̹���"></a>
         <div class="event-text">
            <a href="../event/event_page2.jsp"><h2>�ߵ���-�� �̺�Ʈ 12�� Ư���� (feat.��ŷ��)</h2></a>
            <p>2023. 12. 6.~2023. 12. 17.</p>
         </div>
      </div>
      <div class="event">
         <a href="../event/event_page1.jsp"><img src="../resources/images/event_img11.png" alt="�̺�Ʈ 3 �̹���"></a>
         <div class="event-text">
            <a href="../event/event_page1.jsp"><h2>������ �����ֹ����� �Բ� ������ �ִ� �ָ�, ���� �� �ִ� �ָ�!</h2></a>
            <p>2023. 12. 1.~2024. 2. 4.</p>
         </div>
      </div>
      <div class="event">
         <a href="../event/event_page6.jsp"><img src="../resources/images/Ʈ��2.png" alt="�̺�Ʈ 4 �̹���"></a>
         <div class="event-text">
            <a href="../event/event_page6.jsp"><h2>ũ�������� ���� �Ⱓ ���� �̺�Ʈ!</h2></a>
            <p>2023. 12. 23.~2023. 12. 25.</p>
         </div>
      </div>
      <div class="event">
         <a href="../event/event_page3.jsp"><img src="../resources/images/�ܿＶmini.png" alt="�̺�Ʈ 1 �̹���"></a>
         <div class="event-text">
            <a href="../event/event_page3.jsp"><h2>2023 ã�ư��� ���� �ܿ�X�� ������ �̺�Ʈ</h2></a>
            <p>2023. 12. 1.~2024. 2. 4.</p>
         </div>
      </div>
      <div class="event">
         <a href="../event/event_page2.jsp"><img src="../resources/images/��ŷ��.png" alt="�̺�Ʈ 2 �̹���"></a>
         <div class="event-text">
            <a href="../event/event_page2.jsp"><h2>�ߵ���-�� �̺�Ʈ 12�� Ư���� (feat.��ŷ��)</h2></a>
            <p>2023. 12. 6.~2023. 12. 17.</p>
         </div>
      </div>
      <div class="event">
         <a href="../event/event_page1.jsp"><img src="../resources/images/event_img11.png" alt="�̺�Ʈ 3 �̹���"></a>
         <div class="event-text">
            <a href="../event/event_page1.jsp"><h2>������ �����ֹ����� �Բ� ������ �ִ� �ָ�, ���� �� �ִ� �ָ�!</h2></a>
            <p>2023. 12. 1.~2024. 2. 4.</p>
         </div>
      </div>
      <div class="event">
         <a href="../event/event_page6.jsp"><img src="../resources/images/Ʈ��2.png" alt="�̺�Ʈ 4 �̹���"></a>
         <div class="event-text">
            <a href="../event/event_page6.jsp"><h2>ũ�������� ���� �Ⱓ ���� �̺�Ʈ!</h2></a>
            <p>2023. 12. 23.~2023. 12. 25.</p>
         </div>
      </div>
      

      <!-- �ٸ� �̺�Ʈ�鵵 �����ϰ� �߰��� �� �ֽ��ϴ�. -->

   </main>
   <jsp:include page="../footer.jsp" />
</body>
</html>