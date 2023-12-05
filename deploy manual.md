# A következő módosításokat kell végrehajtani a programkódban, hogy remote serveren is működjön:

## Frontend:

### src/package.json:
	`"start": "ng serve",` --> `"start": "http-server-spa dist/job-compass index.html $PORT",`
	
### environments/environment.ts:
	3. sor komment be, 4. sor komment ki
	
	
## Backend:

### src/main/java/resources/application.properties:
	23-26. sor komment be
	

Frontend online: https://jobcompassproject-093a905f1154.herokuapp.com/
Backend online: https://jobcompass-7acffce134ad.herokuapp.com/