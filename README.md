#SELAB_HW3
<div dir="rtl">
<br />
به نام خدا

در این آزمایش قصد داشتیم تا با اضافه کردن بخش هایی به کد برنامه اعداد پوشش آزمون را افزایش دهیم.
<br />
ابتدا پروژه را در intelijباز کردیم وcoverage ها به صورت زیر بود.پس با ایجاد تغیراتی که در ادامه توضیح خواهیم داد اعداد پوشش آزمون را افزایش می دهیم. لازم بود تا coverege هر سه کلاس را افزایش دهیم.

<br/>
<img width="425" alt="Screenshot 2023-04-15 at 18 36 22" src="https://user-images.githubusercontent.com/58518166/232249119-fbc8897e-e8b7-4069-af9c-06738b04f629.png">
</div>
<br />
<div dir="rtl">
در کل خط ۴۰ و دو تست بعد آن  را اضافه کردیم
</div><img width="804" alt="Screenshot 2023-04-15 at 21 27 10" src="https://user-images.githubusercontent.com/59180989/232245676-d662d753-676c-4973-aacd-b5e79c100512.png">
<br />
<div dir="rtl">
در خط ۴۰ به جای تابع toJSONAString از toString که تابع پدر آن است استفاده می کنیم و آن را فراخوانی میکنیم و بعد هم نتیجه خروجی را با assertEqualsچک می کنیم و اینگونه درصد coverege آن را افزایش می دهیم.
<br />
<div dir="rtl">
تست بعدی برا استفاده از کلاس JSONObjectاست که یک هش مپ ساختیم که از String به Integer  می رود و 
سپس از کلاس JSONObjectیک نمونه می سازیم و دوباره با متد 
assertEquals خروجی را چک می کنیم
<br />
تست اخر هم برای استفاده از کلاس JSONValue است 
که یک string را به json تبدیل می کند 
و بارهم نتیجه خروجی را با 
assertEquals
.بررسی می کنیم
<br />
بعد از این تغیرات coverege به صورت زیر افزایش می یابد:
</div>
<br/>
<img width="425" alt="Screenshot 2023-04-15 at 18 36 22" src="https://user-images.githubusercontent.com/58518166/232249071-538ae814-acc4-4a67-bbd0-2dd671d010f6.png">


<br/>
<br/>
باتشکر
